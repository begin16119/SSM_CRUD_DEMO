package com.auth.service.impl;

import com.auth.dao.UserDao;
import com.auth.entity.User;
import com.auth.service.UserManageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
/**
 * Created by wang on 2017/8/15.
 */
public class UserManageServiceImpl implements UserManageService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;

    public void addUser(User user) {
        userDao.addUser(user);
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    public void deleteUser(long id) {
        userDao.deleteUser(id);
    }

    public User queryUserById(long id) {

        return userDao.queryUserById(id);
    }

    public List<User> queryAllUsers() {
        return userDao.queryAllUsers();
    }
}
