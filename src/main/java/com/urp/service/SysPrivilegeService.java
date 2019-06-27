package com.urp.service;

import com.urp.entity.SysPrivilege;

import java.util.List;

/**
 * @Author AlaneyS
 * @Date 2019/6/25 18:00
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
public interface SysPrivilegeService {

    List<SysPrivilege> selectPrivilegesByRoleId(Integer roleId);
}
