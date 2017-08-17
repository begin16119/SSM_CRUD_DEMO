package com.auth.entity;

/**
 * Created by wang on 2017/8/14.
 */
public class RoleFunction {
    private long id;

    private long roleId;

    private long functionId;
    private int status;

    @Override
    public String toString() {
        return "RoleFunction{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", functionId=" + functionId +
                ", status=" + status +
                '}';
    }

    public RoleFunction(long id, long roleId, long functionId, int status) {
        this.id = id;
        this.roleId = roleId;
        this.functionId = functionId;
        this.status = status;
    }

    public long getId() {
        return id;
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

    public long getFunctionId() {
        return functionId;
    }

    public void setFunctionId(long functionId) {
        this.functionId = functionId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
