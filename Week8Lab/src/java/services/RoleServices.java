/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dataaccess.RoleJpaController;
import java.util.List;
import entity.Role;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 8229942
 */
public class RoleServices {
    public List<Role> getAll() throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Week9LabPU");
        RoleJpaController roleController = new RoleJpaController(emf);
        List<Role> roles = roleController.findRoleEntities();
        return roles;
    }
}
