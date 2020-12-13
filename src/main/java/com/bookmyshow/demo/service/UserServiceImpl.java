package com.bookmyshow.demo.service;

import com.bookmyshow.demo.dao.UserDAO;
import com.bookmyshow.demo.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDao;

    @Transactional
    @Override
    public List<Users> get() {
        return userDao.get();
    }

    @Transactional
    @Override
    public Users get(int id) {
        return userDao.get(id);
    }

    @Transactional
    @Override
    public void save(Users user) {
        userDao.save(user);
    }

    @Transactional
    @Override
    public void delete(int id) {
        userDao.delete(id);
    }
}
