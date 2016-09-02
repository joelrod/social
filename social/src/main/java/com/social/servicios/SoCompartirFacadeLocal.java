/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.servicios;

import com.social.social.SoCompartir;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorodriguez
 */
@Local
public interface SoCompartirFacadeLocal {

    void create(SoCompartir soCompartir);

    void edit(SoCompartir soCompartir);

    void remove(SoCompartir soCompartir);

    SoCompartir find(Object id);

    List<SoCompartir> findAll();

    List<SoCompartir> findRange(int[] range);

    int count();
    
}
