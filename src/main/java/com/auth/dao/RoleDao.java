package com.auth.dao;

import com.auth.entity.Role;

import java.util.List;

/**
 * Created by wang on 2017/8/14.
 */
public interface RoleDao {
    void addRole(Role role);
    void updateRole(Role role);
    void deleteRole(long id);
    Role queryRoleById(long id);
    List<Role> queryAllRoles();

}
