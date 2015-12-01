
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
public class Pergunta {

    @Id
    @NotNull
    private Integer per_id;
    private Integer tipo_tipo_id;
    @Column(length = 255)
    private String enunciado;

    public Integer getPer_id() {
        return per_id;
    }

    public void setPer_id(Integer per_id) {
        this.per_id = per_id;
    }

    public Integer getTipo_tipo_id() {
        return tipo_tipo_id;
    }

    public void setTipo_tipo_id(Integer tipo_tipo_id) {
        this.tipo_tipo_id = tipo_tipo_id;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

}
