package com.auth.service.impl;

import com.auth.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wang on 2017/8/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
                        "classpath:spring/spring-service.xml"})
public class UserManageServiceImplTest {

    @Autowired
    private UserManageServiceImpl userManageService;
    @Test
    public void addUser() throws Exception {
        User user = new User();
        user.setName("汪小萌");
        user.setId(1);
        user.setPwd("123456");
        userManageService.addUser(user);
    }

    @Test
    public void updateUser() throws Exception {

    }

    @Test
    public void deleteUser() throws Exception {

    }

    @Test
    public void queryUserById() throws Exception {

    }

    @Test
    public void queryAllUsers() throws Exception {

    }

}