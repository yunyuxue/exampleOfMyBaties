package com.urp.entity;

/**
 * @Author AlaneyS
 * @Date 2019/6/22 8:59
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
public class SysRolePrivilege {

    //主键ID
    private Integer Id;

    //主键ID
    private Integer roleId;

    //主键ID
    private Integer privilegeId;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }
}
