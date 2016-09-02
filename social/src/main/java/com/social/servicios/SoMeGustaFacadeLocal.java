/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.servicios;

import com.social.social.SoMeGusta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorodriguez
 */
@Local
public interface SoMeGustaFacadeLocal {

    void create(SoMeGusta soMeGusta);

    void edit(SoMeGusta soMeGusta);

    void remove(SoMeGusta soMeGusta);

    SoMeGusta find(Object id);

    List<SoMeGusta> findAll();

    List<SoMeGusta> findRange(int[] range);

    int count();
    
}
