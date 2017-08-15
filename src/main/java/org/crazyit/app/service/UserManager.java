package org.crazyit.app.service;

import java.util.List;

import org.crazyit.app.domain.User;

public interface UserManager {  
    User load(Integer id);  
    User get(Integer id);  
    List<User> findAll();  
    void persist(User entity);  
    Integer save(User entity);  
    void saveOrUpdate(User entity);  
    void delete(Integer id);  
    void flush();  
}  
