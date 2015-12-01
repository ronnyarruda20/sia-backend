
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Maria
 */
@Entity
public class Pessoa {

    @Id
    @NotNull
    private Integer pes_id;

    @Column(length = 255)
    private Integer nome;
    private Integer telefone;

    public Integer getPes_id() {
        return pes_id;
    }

    public void setPes_id(Integer pes_id) {
        this.pes_id = pes_id;
    }

    public Integer getNome() {
        return nome;
    }

    public void setNome(Integer nome) {
        this.nome = nome;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }
}
