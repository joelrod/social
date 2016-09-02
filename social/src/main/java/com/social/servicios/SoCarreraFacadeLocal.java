/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.servicios;

import com.social.social.SoCarrera;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorodriguez
 */
@Local
public interface SoCarreraFacadeLocal {

    void create(SoCarrera soCarrera);

    void edit(SoCarrera soCarrera);

    void remove(SoCarrera soCarrera);

    SoCarrera find(Object id);

    List<SoCarrera> findAll();

    List<SoCarrera> findRange(int[] range);

    int count();
    
}
