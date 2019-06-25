package com.urp.service;

import com.urp.entity.SysRole;
import com.urp.entity.SysUser;

import java.util.List;

/**
 * @Author AlaneyS
 * @Date 2019/6/25 18:00
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
public interface SysRoleService {

    List<SysRole> selectRolesByUserId(Integer id);

    List<SysRole> selectRolesByUser(SysUser sysUser);
}
