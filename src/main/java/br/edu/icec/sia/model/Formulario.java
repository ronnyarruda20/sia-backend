
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
public class Formulario {

    @Id
    @NotNull
    private Integer form_id;
    private Integer descricao_formulario_desc_id;
    private Integer pessoa_pes_id;

    public Integer getForm_id() {
        return form_id;
    }

    public void setForm_id(Integer form_id) {
        this.form_id = form_id;
    }

    public Integer getDescricao_formulario_desc_id() {
        return descricao_formulario_desc_id;
    }

    public void setDescricao_formulario_desc_id(Integer descricao_formulario_desc_id) {
        this.descricao_formulario_desc_id = descricao_formulario_desc_id;
    }

    public Integer getPessoa_pes_id() {
        return pessoa_pes_id;
    }

    public void setPessoa_pes_id(Integer pessoa_pes_id) {
        this.pessoa_pes_id = pessoa_pes_id;
    }

}
