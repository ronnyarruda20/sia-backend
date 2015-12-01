
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
public class Professor {

    @Id
    @NotNull
    private  Integer prof_id;

    public Integer getProf_id() {
        return prof_id;
    }

    public void setProf_id(Integer prof_id) {
        this.prof_id = prof_id;
    }
}
