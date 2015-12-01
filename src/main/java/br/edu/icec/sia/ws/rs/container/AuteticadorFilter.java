/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.icec.sia.ws.rs.container;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Ronny de Arruda
 * 
 * Esta classe faz a verificaçao do token se nao estao vazio ou nullo e se e valido
 */
@Provider
@Autorizador
public class AuteticadorFilter implements ContainerRequestFilter {

  private static final Logger logger = Logger.getLogger(AuteticadorFilter.class.getName());

  @Override
  public void filter(ContainerRequestContext requestContext) throws IOException {
    MultivaluedMap<String, String> headers = requestContext.getHeaders();
    
    List<String> token = headers.get(Autorizador.TICKET_DE_IDENTIFICACAO);
    
    //se caso for nulo ou vazio retorna erro 401.. nao autorizado
    if(token == null || token.isEmpty()) {
      logger.warning("Identificação de usuario ausente");
      requestContext.abortWith(Response.status(401).build());
      return;
    }
    
   // criar metodo que compara com token se for correto cliente pode acessar ao contrario erro 401.. não autorizado
        

  
  
  
  }
}
