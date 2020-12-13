package com.bookmyshow.demo.dao;

import com.bookmyshow.demo.models.Concert;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ConcertDAOImpl implements ConcertDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Concert> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Concert> query= currentSession.createQuery("From Concert", Concert.class);
        List<Concert> list = query.getResultList();
        return  list;
    }

    @Override
    public Concert get(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Concert concert = currentSession.get(Concert.class, id);
        return concert;
    }

    @Override
    public void save(Concert concert) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(concert);
    }

    @Override
    public void delete(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Concert concert = currentSession.get(Concert.class, id);
        currentSession.delete(concert);
    }
}
