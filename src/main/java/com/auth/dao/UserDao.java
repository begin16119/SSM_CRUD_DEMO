package com.auth.dao;

import com.auth.entity.User;

import java.util.List;

/**
 * Created by wang on 2017/8/14.
 */
public interface UserDao {

    void addUser(User user);
    void updateUser(User user);
    void deleteUser(long id);
    User queryUserById(long id);
    List<User> queryAllUsers();
}
