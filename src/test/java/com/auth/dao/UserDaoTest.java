package com.auth.dao;

import com.auth.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wang on 2017/8/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    /**
     * 增加重复id异常
     * 更新不存在异常
     * 删除不存在异常
     * @throws Exception
     */
    @Test
    public void addUser() throws Exception {
        User user = new User();
        user.setName("汪小萌");
        user.setId(10);
        user.setPwd("123456");
        userDao.addUser(user);
    }

    @Test
    public void updateUser() throws Exception {
        User user = new User();
        user.setName("汪小军");
        user.setId(1010);
        user.setPwd("123456");
        userDao.updateUser(user);
    }

    @Test
    public void deleteUser() throws Exception {
        User user = new User();
        user.setName("汪小军");
        user.setId(1010);
        user.setPwd("123456");
        userDao.deleteUser(user.getId());
    }

    @Test
    public void queryUserById() throws Exception {
        User user = userDao.queryUserById(1011);
        System.out.println(user);
    }

    @Test
    public void queryAllUsers() throws Exception {
        List<User> list = userDao.queryAllUsers();
        for (User user : list) {
            System.out.println(user);
        }
    }

}