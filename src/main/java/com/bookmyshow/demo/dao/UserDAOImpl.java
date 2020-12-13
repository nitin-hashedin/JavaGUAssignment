package com.bookmyshow.demo.dao;

import com.bookmyshow.demo.models.Users;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Users> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Users> query= currentSession.createQuery("From Users", Users.class);
        List<Users> list = query.getResultList();
        return  list;
    }

    @Override
    public Users get(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Users user = currentSession.get(Users.class, id);
        return user;
    }

    @Override
    public void save(Users user) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(user);
    }

    @Override
    public void delete(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Users user = currentSession.get(Users.class, id);
        currentSession.delete(user);
    }
}
