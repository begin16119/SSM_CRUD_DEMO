package com.auth.dao;

import com.auth.entity.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by wang on 2017/8/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class RoleDaoTest {

    @Resource
    private RoleDao roleDao;
    @Test
    public void addRole() throws Exception {
        Role role = new Role();
        role.setId(1);
        role.setName("管理员");
        roleDao.addRole(role);
    }

    @Test
    public void updateRole() throws Exception {
        Role role = new Role();
        role.setId(1);
        role.setName("上帝");
        roleDao.updateRole(role);
    }

    @Test
    public void deleteRole() throws Exception {
        roleDao.deleteRole(1);
    }

    @Test
    public void queryRoleById() throws Exception {

    }

    @Test
    public void queryAllRoles() throws Exception {

    }

}