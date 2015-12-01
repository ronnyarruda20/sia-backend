
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
public class Pergunta_resposta {

    @Id
    @NotNull
    private Integer per_res_id;
    @NotNull
    private Integer formulario_id;
    @NotNull
    private Integer resposta_completa_id;
    @NotNull
    private Integer pergunta_id;

    public Integer getPer_res_id() {
        return per_res_id;
    }

    public void setPer_res_id(Integer per_res_id) {
        this.per_res_id = per_res_id;
    }

    public Integer getFormulario_id() {
        return formulario_id;
    }

    public void setFormulario_id(Integer formulario_id) {
        this.formulario_id = formulario_id;
    }

    public Integer getResposta_completa_id() {
        return resposta_completa_id;
    }

    public void setResposta_completa_id(Integer resposta_completa_id) {
        this.resposta_completa_id = resposta_completa_id;
    }

    public Integer getPergunta_id() {
        return pergunta_id;
    }

    public void setPergunta_id(Integer pergunta_id) {
        this.pergunta_id = pergunta_id;
    }
}
