package com.urp.mapper;

import com.urp.entity.SysRole;
import com.urp.entity.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author AlaneyS
 * @Date 2019/6/25 17:54
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
public interface SysRoleMapper {

    List<SysRole> selectRolesByUserId(@Param("userId") Integer userId);

    List<SysRole> selectRolesByUser(SysUser sysUser);

}
