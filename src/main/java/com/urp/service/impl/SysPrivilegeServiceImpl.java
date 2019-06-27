package com.urp.service.impl;

import com.urp.entity.SysPrivilege;
import com.urp.mapper.SysPrivilegeMapper;
import com.urp.service.SysPrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author AlaneyS
 * @Date 2019/6/27 10:35
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
@Service
public class SysPrivilegeServiceImpl implements SysPrivilegeService {

    @Autowired
    private SysPrivilegeMapper sysPrivilegeMapper;

    @Override
    public List<SysPrivilege> selectPrivilegesByRoleId(Integer roleId) {
        return sysPrivilegeMapper.selectPrivilegesByRoleId(roleId);
    }
}
