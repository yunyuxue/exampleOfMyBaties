package com.urp.service.impl;

import com.urp.entity.SysRole;
import com.urp.entity.SysUser;
import com.urp.mapper.SysRoleMapper;
import com.urp.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author AlaneyS
 * @Date 2019/6/25 18:01
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<SysRole> selectRolesByUserId(Integer userId) {
        return sysRoleMapper.selectRolesByUserId(userId);
    }

    @Override
    public List<SysRole> selectRolesByUser(SysUser sysUser) {
        return sysRoleMapper.selectRolesByUser(sysUser);
    }
}
