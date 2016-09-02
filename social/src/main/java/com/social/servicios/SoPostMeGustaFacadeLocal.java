/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.servicios;

import com.social.social.SoPostMeGusta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorodriguez
 */
@Local
public interface SoPostMeGustaFacadeLocal {

    void create(SoPostMeGusta soPostMeGusta);

    void edit(SoPostMeGusta soPostMeGusta);

    void remove(SoPostMeGusta soPostMeGusta);

    SoPostMeGusta find(Object id);

    List<SoPostMeGusta> findAll();

    List<SoPostMeGusta> findRange(int[] range);

    int count();
    
}
