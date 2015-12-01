
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
public class Resposta {

    @Id
    @NotNull
    private Integer res_id;
    private Integer resposta_completa_res_completa_id;
    private Integer tipo_id;
    @Column(length = 255)
    Integer descricao;

    public Integer getRes_id() {
        return res_id;
    }

    public void setRes_id(Integer res_id) {
        this.res_id = res_id;
    }

    public Integer getResposta_completa_res_completa_id() {
        return resposta_completa_res_completa_id;
    }

    public void setResposta_completa_res_completa_id(Integer resposta_completa_res_completa_id) {
        this.resposta_completa_res_completa_id = resposta_completa_res_completa_id;
    }

    public Integer getTipo_id() {
        return tipo_id;
    }

    public void setTipo_id(Integer tipo_id) {
        this.tipo_id = tipo_id;
    }
}
