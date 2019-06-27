package com.urp.mapper;

import com.urp.entity.SysPrivilege;

import java.util.List;

/**
 * @Author AlaneyS
 * @Date 2019/6/27 10:27
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
public interface SysPrivilegeMapper {

    List<SysPrivilege> selectPrivilegesByRoleId(Integer roleId);
}
