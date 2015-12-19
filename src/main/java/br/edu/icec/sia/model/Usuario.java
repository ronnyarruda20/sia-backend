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
@NamedQuery(
        name="validadaUsuario",
        query="from Usuario u"
                + "   where u.nome = :nome"
                + "   and u.senha = :senha"
)
@SequenceGenerator(name = "UsuarioSequence", sequenceName = "usuarioseq", allocationSize=1)
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="UsuarioSequence")
    private Long id;
    private String nome;
    private String senha;

    public Usuario() {
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
