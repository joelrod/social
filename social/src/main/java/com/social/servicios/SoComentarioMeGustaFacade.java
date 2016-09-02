/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.servicios;

import com.social.social.SoComentarioMeGusta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jorodriguez
 */
@Stateless
public class SoComentarioMeGustaFacade extends AbstractFacade<SoComentarioMeGusta> implements SoComentarioMeGustaFacadeLocal {

    @PersistenceContext(unitName = "socialPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SoComentarioMeGustaFacade() {
        super(SoComentarioMeGusta.class);
    }
    
}
