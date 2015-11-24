/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.icec.sia.bussines;

import br.edu.icec.sia.model.Teste;
import java.util.List;
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
  
  public List<Teste> retornaListaTeste(){
    
    entityManager.merge(new Teste(1L, "Primeiro Json retornado"));
    
    return entityManager.createNamedQuery("listaTudo", Teste.class).getResultList();
  }
  
}
