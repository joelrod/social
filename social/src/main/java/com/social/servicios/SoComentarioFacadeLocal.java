/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.servicios;

import com.social.social.SoComentario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorodriguez
 */
@Local
public interface SoComentarioFacadeLocal {

    void create(SoComentario soComentario);

    void edit(SoComentario soComentario);

    void remove(SoComentario soComentario);

    SoComentario find(Object id);

    List<SoComentario> findAll();

    List<SoComentario> findRange(int[] range);

    int count();
    
}
