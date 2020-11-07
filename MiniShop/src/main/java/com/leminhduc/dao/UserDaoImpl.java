package com.leminhduc.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.leminhduc.model.Users;
 

 
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;
 
    @SuppressWarnings("unchecked")
	public Users findByUserName(String username) {
        Session session = null;
 
        try {
            session = sessionFactory.openSession();
            List<Users> users = new ArrayList<Users>();
            users = session.createQuery("from Users where username=?")
                    .setParameter(0, username).list();
            if (users.size() > 0) {
                return users.get(0);
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return null;
    }
 
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
