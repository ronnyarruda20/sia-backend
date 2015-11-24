/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.icec.sia.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Ronny de Arruda
 */
@Entity
@Table(name = "teste")
@NamedQuery(
  name = "listaTudo",
  query = "from Teste t"
)
public class Teste implements Serializable {
  
  @Id
  private Long id;
  private String nome;

  public Teste() {
  }

  public Teste(Long id, String nome) {
    this.id = id;
    this.nome = nome;
  }
  
  
  
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  
  
  
}
