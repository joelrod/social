/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.servicios;

import com.social.social.SoSolicitudAmistad;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jorodriguez
 */
@Stateless
public class SoSolicitudAmistadFacade extends AbstractFacade<SoSolicitudAmistad> implements SoSolicitudAmistadFacadeLocal {

    @PersistenceContext(unitName = "socialPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SoSolicitudAmistadFacade() {
        super(SoSolicitudAmistad.class);
    }
    
}
