/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.icec.sia.view;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author Ronny de Arruda
 */
@ApplicationPath("/webapi")
public class SiaEndPointPath extends Application {

  @Override
  public Set<Class<?>> getClasses() {

    final Set<Class<?>> classes = new HashSet<>();
//  register root resource
    classes.add(SiaEndPoint.class);
    return classes;
  }

}
