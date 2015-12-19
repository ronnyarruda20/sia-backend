/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.icec.sia.bussines;


import br.edu.icec.sia.model.Usuario;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import java.security.Key;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ronny de Arruda
 */
@Stateless
public class SiaController {

  @PersistenceContext
  private EntityManager entityManager;

 

  //Autentica O usuario e gera uma Chave
  public String autenticarUsuario(Usuario usuario) throws Exception {
    
  
     if(usuario == null){
       
      throw new Exception("Usuario Vazio");
         
   }
        int buscaUsuario = entityManager.
           createNamedQuery("validadaUsuario")
           .setParameter("nome", usuario.getNome())
           .setParameter("senha", usuario.getSenha())
           .getFirstResult();
    if(buscaUsuario < 0){  
        
        throw new Exception("Usuario Não existe");
    }
      
    Key key = MacProvider.generateKey();

    return Jwts.builder().setSubject(usuario.getNome()).signWith(SignatureAlgorithm.HS512, key).compact();
  }

    public Usuario pegarUsuario(Usuario usuario) {
      
        return entityManager.
           createNamedQuery("validadaUsuario", Usuario.class)
           .setParameter("nome", usuario.getNome())
           .setParameter("senha", usuario.getSenha())
           .getSingleResult();

    }

   
}
