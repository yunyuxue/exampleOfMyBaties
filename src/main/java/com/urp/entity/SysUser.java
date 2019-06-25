package com.urp.entity;

import java.sql.Timestamp;

/**
 * @author ：song
 * @date ：Created in 2019/6/20 12:37
 * @description：用户表
 * @modified By：
 * @version: 1.0.0
 */

public class SysUser {

    //主键ID
    private Integer Id;

    //用户名称
    private String userName;

    //用户年龄
    private Integer userAge;

    //用户性别
    private String userGender;

    //用户电话
    private String userPhone;

    //用户邮箱
    private String userEmail;

    //用户地址
    private String userAddress;

    //用户头像
    private Byte[] userHeadImg;

    //创建时间
    private Timestamp createTime;

    //最近更新时间
    private Timestamp lastUpdateTime;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Byte[] getUserHeadImg() {
        return userHeadImg;
    }

    public void setUserHeadImg(Byte[] userHeadImg) {
        this.userHeadImg = userHeadImg;
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
