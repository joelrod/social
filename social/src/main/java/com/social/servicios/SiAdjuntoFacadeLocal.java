/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.servicios;

import com.social.social.SiAdjunto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorodriguez
 */
@Local
public interface SiAdjuntoFacadeLocal {

    void create(SiAdjunto siAdjunto);

    void edit(SiAdjunto siAdjunto);

    void remove(SiAdjunto siAdjunto);

    SiAdjunto find(Object id);

    List<SiAdjunto> findAll();

    List<SiAdjunto> findRange(int[] range);

    int count();
    
}
