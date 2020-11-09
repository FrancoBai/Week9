/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dataaccess.UserJpaController;
import java.util.List;
import entity.User;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author 829942
 */
public class UserService {
    
//    public User get(String email) throws Exception {
//        UserDB userDB = new UserDB();
//        User user = userDB.get(email);
//        return user;
//    }
//    
    public List<User> getAll() throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Week9LabPU");
        UserJpaController userController = new UserJpaController(emf);
        List<User> users = userController.findUserEntities();
        return users;
    }
//    
//    
    public void insert(User thisUser) throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Week9LabPU");
        UserJpaController userController = new UserJpaController(emf);
        userController.create(thisUser);

    }
//    
//    public void update(User thisUser) throws Exception {
//        User user = thisUser;
//        UserDB userDB = new UserDB();
//        userDB.update(user);
//    }
//    
//    public void delete(String email) throws Exception {
//        UserDB userDB = new UserDB();
//        userDB.delete(email);
//    }
   
}
