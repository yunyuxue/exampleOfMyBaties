package com.urp.controller;

import com.urp.service.SysUserService;
import com.urp.entity.SysUser;
import com.urp.constant.UserConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author AlaneyS
 * @Date 2019/6/22 10:01
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/id")
    public Object selectUserById(String userId){
        SysUser sysUser = new SysUser();
        try{
            sysUser = sysUserService.selectByUserId(Integer.parseInt(userId));
        }catch (Exception e){
            logger.error(e.getMessage(), e);
        }
        return sysUser;
    }

    @RequestMapping("/all")
    public Object selectAllUsers(){
        List<SysUser> sysUsers = new ArrayList<SysUser>();
        try{
            sysUsers = sysUserService.selectAll();
        }catch (Exception e){
            logger.error(e.getMessage(), e);
        }
        return sysUsers;
    }


    @RequestMapping(value = "/add", method = {RequestMethod.POST})
    public boolean insertOneUser(@RequestBody SysUser sysUser){
        SysUser user = new SysUser();
        boolean flag = false;
        try{
            if(sysUser.getUserName() != null && !sysUser.getUserName().isEmpty()){
                user.setUserName(sysUser.getUserName());
            }
            if(sysUser.getUserAge() > 0) {
                user.setUserAge(sysUser.getUserAge());
            }
            if(sysUser.getUserEmail() != null && !sysUser.getUserEmail().isEmpty()) {
                user.setUserEmail(sysUser.getUserEmail());
            }
            if(sysUser.getUserAddress() != null && !sysUser.getUserAddress().isEmpty()) {
                user.setUserAddress(sysUser.getUserAddress());
            }
            if(sysUser.getUserPhone() != null && !sysUser.getUserPhone().isEmpty()) {
                user.setUserPhone(sysUser.getUserPhone());
            }
            if(sysUser.getUserGender() != null && !sysUser.getUserGender().isEmpty()) {
                user.setUserGender(UserConstant.Gender.W);
            }
            flag = (sysUserService.insertOne(user) > 0);
        }catch (Exception e){
            logger.error(e.getMessage(), e);
        }
        return flag;
    }
}