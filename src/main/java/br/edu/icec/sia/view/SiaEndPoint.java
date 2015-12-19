/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.icec.sia.view;

import br.edu.icec.sia.bussines.SiaController;
import br.edu.icec.sia.model.Usuario;
import br.edu.icec.sia.ws.rs.container.Autorizador;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import java.security.Key;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Toda as classes que tiverem anotado com @Autorizador devera conter no header 
 * da requisição o token
 * @author Ronny de Arruda
 */
@Path("/avaliacao")
public class SiaEndPoint {
  
  @EJB
  SiaController siaController;
  
  
  //https://github.com/jwtk/jjwt
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("/gerar")
  public Response autenticarUsuario(Usuario usuario) throws Exception{
      
    String token = siaController.autenticarUsuario(usuario);    
    return Response.ok(token)
      .header(Autorizador.TICKET_DE_IDENTIFICACAO, token)
      .build();
  }
  
  @GET
//  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/tela")
  @Autorizador
  public String telaDeVisao(){
    
    return "qualquer coisa";
    
  }
  
  
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/usuario")
  public Response pegarUsuario(Usuario user){
    
       
      Usuario usuario = siaController.pegarUsuario(user);
      
       Key key = MacProvider.generateKey();

       String token = Jwts.builder().setSubject(usuario.getNome()).signWith(SignatureAlgorithm.HS512, key).compact();
       return Response.ok(usuario)
       .header(Autorizador.TICKET_DE_IDENTIFICACAO, token)
      .build();
  }
  
}
