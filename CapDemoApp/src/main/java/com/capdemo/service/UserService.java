package com.capdemo.service;

import java.util.List;

import com.capdemo.domain.User;

public interface UserService {

	User findByUsername(String username);

    User findByEmail(String email);

    boolean checkUserExists(String username, String email);

    boolean checkUsernameExists(String username);

    boolean checkEmailExists(String email);
    
   // void save (User user);
    
   // User createUser(User user, Set<UserRole> userRoles);
    
    void save(User user); 
    
   /* List<User> findUserList();

    void enableUser (String username);

    void disableUser (String username);*/
	
	
}
