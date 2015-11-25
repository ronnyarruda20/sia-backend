/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.icec.sia.view;

import br.edu.icec.sia.bussines.SiaController;
import br.edu.icec.sia.model.Alternativa;
import br.edu.icec.sia.model.Questao;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Ronny de Arruda
 */
@Path("/avaliacao")
public class SiaEndPoint {
  
  @EJB
  SiaController siaController;
  
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/lista")
  public List<Questao> retornaListaDeTeste(){
    
    return siaController.retornarListaComQuestao();
    
  }
}
