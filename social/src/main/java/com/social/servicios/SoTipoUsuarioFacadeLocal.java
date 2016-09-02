/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.servicios;

import com.social.social.SoTipoUsuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorodriguez
 */
@Local
public interface SoTipoUsuarioFacadeLocal {

    void create(SoTipoUsuario soTipoUsuario);

    void edit(SoTipoUsuario soTipoUsuario);

    void remove(SoTipoUsuario soTipoUsuario);

    SoTipoUsuario find(Object id);

    List<SoTipoUsuario> findAll();

    List<SoTipoUsuario> findRange(int[] range);

    int count();
    
}
