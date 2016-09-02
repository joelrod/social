/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.servicios;

import com.social.social.SoPost;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorodriguez
 */
@Local
public interface SoPostFacadeLocal {

    void create(SoPost soPost);

    void edit(SoPost soPost);

    void remove(SoPost soPost);

    SoPost find(Object id);

    List<SoPost> findAll();

    List<SoPost> findRange(int[] range);

    int count();
    
}
