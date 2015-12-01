/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.icec.sia.bussines;


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
  public String autenticarUsuario() {
    
    Key key = MacProvider.generateKey();

    return Jwts.builder().setSubject("ronny").signWith(SignatureAlgorithm.HS512, key).compact();

   
  }

}
