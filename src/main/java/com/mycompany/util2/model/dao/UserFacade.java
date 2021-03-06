/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.util2.model.dao;

import com.mycompany.util2.model.entity.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Tiaro
 */
@Stateless
public class UserFacade extends AbstractFacade<User> {

    @PersistenceContext(unitName = "my_persistence_unit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(User.class);
    }
    
}
