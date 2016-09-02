/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.servicios;

import com.social.social.SoNotificacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorodriguez
 */
@Local
public interface SoNotificacionFacadeLocal {

    void create(SoNotificacion soNotificacion);

    void edit(SoNotificacion soNotificacion);

    void remove(SoNotificacion soNotificacion);

    SoNotificacion find(Object id);

    List<SoNotificacion> findAll();

    List<SoNotificacion> findRange(int[] range);

    int count();
    
}
