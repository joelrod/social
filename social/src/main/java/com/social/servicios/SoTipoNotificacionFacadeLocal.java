/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.servicios;

import com.social.social.SoTipoNotificacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorodriguez
 */
@Local
public interface SoTipoNotificacionFacadeLocal {

    void create(SoTipoNotificacion soTipoNotificacion);

    void edit(SoTipoNotificacion soTipoNotificacion);

    void remove(SoTipoNotificacion soTipoNotificacion);

    SoTipoNotificacion find(Object id);

    List<SoTipoNotificacion> findAll();

    List<SoTipoNotificacion> findRange(int[] range);

    int count();
    
}
