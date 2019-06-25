package com.urp.mapper;

import com.urp.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author AlaneyS
 * @Date 2019/6/22 9:29
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
//@Mapper
public interface SysUserMapper {
    SysUser selectByUserId(Integer id);

    List<SysUser> selectAll();

    int insertOne(SysUser sysUser);
}
