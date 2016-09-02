/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.servicios;

import com.social.social.SoComentarioMeGusta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorodriguez
 */
@Local
public interface SoComentarioMeGustaFacadeLocal {

    void create(SoComentarioMeGusta soComentarioMeGusta);

    void edit(SoComentarioMeGusta soComentarioMeGusta);

    void remove(SoComentarioMeGusta soComentarioMeGusta);

    SoComentarioMeGusta find(Object id);

    List<SoComentarioMeGusta> findAll();

    List<SoComentarioMeGusta> findRange(int[] range);

    int count();
    
}
