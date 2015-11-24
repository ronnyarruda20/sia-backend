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

/**
 *
 * @author Ronny
 */
@Entity
@NamedQuery(
      name = "retornaQuestao",
      query = "from Questao q"
              + " where Alternativa a q.id = a.questao.id "
)
public class Questao implements Serializable {
    
    @Id
    private Integer id;
    private String descricao;

    public Questao() {
    }

    public Questao(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
