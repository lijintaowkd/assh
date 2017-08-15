package org.crazyit.app.dao.daoImpl;

import java.util.List;

import org.crazyit.app.dao.UserDao;
import org.crazyit.app.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
  

  
@Repository("UserDao")  
public class UserDaoImpl implements UserDao{  
      
    @Autowired  
    private SessionFactory sessionFactory;  
      
    private Session getCurrentSession() {  
        return sessionFactory.getCurrentSession();  
    }  
  
      
    public User load(Integer id) {  
        return getCurrentSession().load(User.class, id);  
    }  
  
      
    public User get(Integer id) {  
        return getCurrentSession().get(User.class, id);  
    }  
  
    @SuppressWarnings("unchecked")  
      
    public List<User> findAll() {  
        return getCurrentSession().createQuery("from user").list();  
    }  
  
      
    public void persist(User entity) {  
        getCurrentSession().persist(entity);  
    }  
  
      
    public Integer save(User entity) {  
        return (Integer)getCurrentSession().save(entity);  
    }  
  
      
    public void saveOrUpdate(User entity) {  
        getCurrentSession().saveOrUpdate(entity);  
    }  
  
      
    public void delete(Integer id) {  
        getCurrentSession().delete(this.get(id));  
    }  
  
      
    public void flush() {  
        getCurrentSession().flush();  
    }  
  
}  