package com.urp.entity;

import java.sql.Timestamp;

/**
 * @Author AlaneyS
 * @Date 2019/6/22 8:57
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
public class SysPrivilege {

    //主键ID
    private Integer Id;

    //权限名称
    private String privilegeName;

    //权限URL
    private String privilegeUrl;

    //权限描述
    private String privilegeDesc;

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

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    public String getPrivilegeUrl() {
        return privilegeUrl;
    }

    public void setPrivilegeUrl(String privilegeUrl) {
        this.privilegeUrl = privilegeUrl;
    }

    public String getPrivilegeDesc() {
        return privilegeDesc;
    }

    public void setPrivilegeDesc(String privilegeDesc) {
        this.privilegeDesc = privilegeDesc;
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
