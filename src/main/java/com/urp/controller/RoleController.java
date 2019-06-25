package com.urp.controller;

import com.urp.entity.SysRole;
import com.urp.service.SysRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author AlaneyS
 * @Date 2019/6/25 18:03
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
@RestController
@RequestMapping("/role")
public class RoleController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping("/allById")
    public Object selectRolesByUserId(Integer id){
        List<SysRole> sysRoles = new ArrayList<SysRole>();
        try{
            sysRoles = sysRoleService.selectRolesByUserId(id);
        }catch (Exception e){
            logger.error(e.getMessage(), e);
        }
        return sysRoles;
    }
}
