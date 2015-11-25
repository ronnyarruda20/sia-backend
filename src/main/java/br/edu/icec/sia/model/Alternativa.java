/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.icec.sia.model;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author Ronny
 */
@Entity
public class Alternativa implements Serializable {
    
    @Id
    private Integer id;
    private String descricao;
    
    @ManyToOne
    @JoinColumn(name = "questao")
    private Questao questao;

    public Alternativa() {
    }
    
    public Alternativa(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Alternativa(Integer id, String descricao, Questao questao) {
        this.id = id;
        this.descricao = descricao;
        this.questao = questao;
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

    public Questao getQuestao() {
        return questao;
    }

    public void setQuestao(Questao questao) {
        this.questao = questao;
    }
    
    
}
