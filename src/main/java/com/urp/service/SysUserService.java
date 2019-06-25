package com.urp.service;

import com.urp.entity.SysUser;

import java.util.List;

/**
 * @Author AlaneyS
 * @Date 2019/6/22 9:56
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
public interface SysUserService {
    SysUser selectByUserId(Integer id);

    List<SysUser> selectAll();

    int insertOne(SysUser sysUser);
}
