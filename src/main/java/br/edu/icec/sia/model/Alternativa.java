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
@SequenceGenerator(name = "AlternativaSequence", sequenceName = "AlternativaSeq", initialValue = 1, allocationSize = 1)
public class Alternativa implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AlternativaSequence")
    private Integer id;
    private String descricao;

    public Alternativa() {
    }
    
    public Alternativa(Integer id, String descricao) {
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
