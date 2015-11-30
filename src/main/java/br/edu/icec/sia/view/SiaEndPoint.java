/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.icec.sia.view;

import br.edu.icec.sia.bussines.SiaController;
import br.edu.icec.sia.model.Alternativa;
import br.edu.icec.sia.ws.rs.container.Autorizador;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import java.util.List;
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
  
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/lista")
  public List<Alternativa> retornaListaDeTeste(){
    
    return siaController.retornarListaComQuestao();
    
  }
  
  //https://github.com/jwtk/jjwt
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/gerar")
  public Response autenticarUsuario(){
    
    String token = siaController.autenticarUsuario();
    
    return Response.ok(token)
      .header(Autorizador.TICKET_DE_IDENTIFICACAO, token)
      .build();
  }
  
  @GET
//  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/autenticar")
  @Autorizador
  public String autenticadorDeUsuario(){
    
    return "qualquer coisa";
    
  }
}
