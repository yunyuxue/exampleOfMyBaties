package com.urp.entity;

/**
 * @Author AlaneyS
 * @Date 2019/6/22 8:58
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
public class SysUserRole {
    //主键ID
    private Integer Id;

    //主键ID
    private Integer userId;

    //主键ID
    private Integer roleId;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
