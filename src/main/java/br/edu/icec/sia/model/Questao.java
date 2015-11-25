/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.icec.sia.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;


/**
 *
 * @author Ronny
 */
@Entity
@NamedQuery(
      name = "retornaQuestao",
      query = "from Questao q"
          + " where q.id = 1"
            
)
@SequenceGenerator(name = "QuestaoSequence", sequenceName = "QuestaoSeq", initialValue = 1, allocationSize = 1)
public class Questao implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "QuestaoSequence")
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
