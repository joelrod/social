/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.servicios;

import com.social.social.SoSolicitudAmistad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorodriguez
 */
@Local
public interface SoSolicitudAmistadFacadeLocal {

    void create(SoSolicitudAmistad soSolicitudAmistad);

    void edit(SoSolicitudAmistad soSolicitudAmistad);

    void remove(SoSolicitudAmistad soSolicitudAmistad);

    SoSolicitudAmistad find(Object id);

    List<SoSolicitudAmistad> findAll();

    List<SoSolicitudAmistad> findRange(int[] range);

    int count();
    
}
