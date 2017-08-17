package com.auth.service;

import com.auth.entity.User;

import java.util.List;

/**
 * Created by wang on 2017/8/15.
 */
public interface UserManageService {

    void addUser(User user);
    void updateUser(User user);
    void deleteUser(long id);
    User queryUserById(long id);
    List<User> queryAllUsers();
}
