package com.auth.entity;

/**
 * Created by wang on 2017/8/14.
 */
public class UserRole {
    private long id;

    private long roleId;

    private long userId;
    public long getId() {
        return id;
    }



    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", userId=" + userId +
                '}';
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public UserRole(long roleId, long userId) {

        this.roleId = roleId;
        this.userId = userId;
    }
}
