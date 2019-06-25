package com.urp.entity;

import java.sql.Timestamp;

/**
 * @Author AlaneyS
 * @Date 2019/6/22 8:49
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
public class SysRole {

    //主键ID
    private Integer Id;

    //角色名称
    private String roleName;

    //角色有效标志位
    private String roleEnabled;

    //角色描述
    private String roleDesc;

    /*
     * 创建时间
     */
    private Timestamp createTime;

    //最近更新时间
    private Timestamp lastUpdateTime;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleEnabled() {
        return roleEnabled;
    }

    public void setRoleEnabled(String roleEnabled) {
        this.roleEnabled = roleEnabled;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Timestamp lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
