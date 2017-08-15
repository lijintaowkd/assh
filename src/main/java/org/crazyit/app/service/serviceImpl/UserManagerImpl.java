package org.crazyit.app.service.serviceImpl;

import java.util.List;

import org.crazyit.app.dao.UserDao;
import org.crazyit.app.domain.User;
import org.crazyit.app.service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
  
@Service("userManager")  
public class UserManagerImpl implements UserManager {  
    @Autowired  
    UserDao userDao;  
  
      
    public User load(Integer id) {  
        return null;  
    }  
  
      
    public User get(Integer id) {  
        return userDao.get(id);  
    }  
  
      
    public List<User> findAll() {  
        return userDao.findAll();  
    }  
  
      
    public void persist(User entity) {  
        userDao.persist(entity);  
    }  
  
      
    public Integer save(User entity) {  
        return userDao.save(entity);  
    }  
  
      
    public void saveOrUpdate(User entity) {  
        userDao.saveOrUpdate(entity);  
    }  
  
      
    public void delete(Integer id) {  
        userDao.delete(id);  
    }  
  
      
    public void flush() {  
        userDao.flush();  
    }  
  
}  