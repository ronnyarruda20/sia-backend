
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

public class Resposta_completa {

    @Id
    @NotNull
    private Integer res_completa_id;

    public Integer getRes_completa_id() {
        return res_completa_id;
    }

    public void setRes_completa_id(Integer res_completa_id) {
        this.res_completa_id = res_completa_id;
    }
}
