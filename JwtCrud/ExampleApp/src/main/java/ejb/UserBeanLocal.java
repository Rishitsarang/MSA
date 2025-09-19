/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/SessionLocal.java to edit this template
 */
package ejb;

import entity.User;
import jakarta.ejb.Local;
import java.util.List;
/**
 *
 * @author pratham sarang
 */
@Local
public interface UserBeanLocal {
    void addUser(User user);
    void updateUser(User user);
    List<User> getAllUser();
    void deleteUser(Integer userId);
    
    
}
