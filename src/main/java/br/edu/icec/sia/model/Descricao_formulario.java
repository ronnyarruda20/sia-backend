
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
public class Descricao_formulario {

    @Id
    @NotNull
    private Integer desc_id;
    @Column(length = 255)
    private String descricao;

    public Integer getDesc_id() {
        return desc_id;
    }

    public void setDesc_id(Integer desc_id) {
        this.desc_id = desc_id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
