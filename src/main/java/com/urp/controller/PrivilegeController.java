package com.urp.controller;

import com.urp.entity.SysPrivilege;
import com.urp.service.SysPrivilegeService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author AlaneyS
 * @Date 2019/6/27 10:36
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
@RestController
@RequestMapping("/privilege")
public class PrivilegeController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SysPrivilegeService sysPrivilegeService;

    @RequestMapping(value = "/getPrivilegesByRoleId", method = {RequestMethod.GET})
    public Object getPrivilegesByRoleId(Integer roleId){
        List<SysPrivilege> privileges = new ArrayList<SysPrivilege>();
        try{
            privileges = sysPrivilegeService.selectPrivilegesByRoleId(roleId);
        } catch (Exception e){
            logger.error(e.getMessage(), e);
        }
        return privileges;
    }
}
