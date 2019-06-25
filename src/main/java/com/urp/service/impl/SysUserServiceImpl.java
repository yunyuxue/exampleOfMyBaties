package com.urp.service.impl;

import com.urp.service.SysUserService;
import com.urp.entity.SysUser;
import com.urp.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author AlaneyS
 * @Date 2019/6/22 9:56
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser selectByUserId(Integer id) {
        return sysUserMapper.selectByUserId(id);
    }

    @Override
    public List<SysUser> selectAll() {
        return sysUserMapper.selectAll();
    }

    @Override
    public int insertOne(SysUser sysUser) {
        return sysUserMapper.insertOne(sysUser);
    }
}
