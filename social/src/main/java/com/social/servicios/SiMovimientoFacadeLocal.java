/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.servicios;

import com.social.social.SiMovimiento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorodriguez
 */
@Local
public interface SiMovimientoFacadeLocal {

    void create(SiMovimiento siMovimiento);

    void edit(SiMovimiento siMovimiento);

    void remove(SiMovimiento siMovimiento);

    SiMovimiento find(Object id);

    List<SiMovimiento> findAll();

    List<SiMovimiento> findRange(int[] range);

    int count();
    
}
