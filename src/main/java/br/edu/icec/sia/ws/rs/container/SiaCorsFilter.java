/*
 * Esta classe ira permirtir que o header seja  da seguinte forma
 * 
 */
package br.edu.icec.sia.ws.rs.container;

import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Ronny de Arruda
 * 
 */
@Provider
public class SiaCorsFilter implements ContainerResponseFilter{
  
   @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {

        MultivaluedMap<String, Object> headers = responseContext.getHeaders();
        
        headers.add("Access-Control-Allow-Origin", "*");
        headers.add("Access-Control-Allow-Credentials", "true");
        headers.add("Access-Control-Allow-Headers", "origin, content-type, accept, " + Autorizador.TICKET_DE_IDENTIFICACAO);
        headers.add("Access-Control-Expose-Headers", Autorizador.TICKET_DE_IDENTIFICACAO);
        headers.add("Access-Control-Allow-Methods", "GET, POST, OPTIONS, HEAD");
        headers.add("Access-Control-Max-Age", "86400");
    
    }
  
}
