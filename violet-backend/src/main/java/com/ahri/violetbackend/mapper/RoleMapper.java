package com.ahri.violetbackend.mapper;

import com.ahri.violetbackend.domain.Role;

import java.util.List;
// import com.baomidou.mybatisplus.core.mapper.BaseMapper;

// @Mapper
public interface RoleMapper /*extends BaseMapper<Role>*/ {
    public List<Role> selectRoleList();

    // 依赖注入方式
    // @Insert("insert into role values (#{nameZh}, #{nameEn}, #{birthday}, #{title}, #{version}, #{constellation}, " +
    //         "#{level})")
    // void insertRole(Role role);
}
