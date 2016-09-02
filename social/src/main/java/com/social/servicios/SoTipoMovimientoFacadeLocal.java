/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.servicios;

import com.social.social.SoTipoMovimiento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorodriguez
 */
@Local
public interface SoTipoMovimientoFacadeLocal {

    void create(SoTipoMovimiento soTipoMovimiento);

    void edit(SoTipoMovimiento soTipoMovimiento);

    void remove(SoTipoMovimiento soTipoMovimiento);

    SoTipoMovimiento find(Object id);

    List<SoTipoMovimiento> findAll();

    List<SoTipoMovimiento> findRange(int[] range);

    int count();
    
}
