package com.ahri.violetbackend.service;

import com.ahri.violetbackend.domain.Role;

import java.util.List;

public interface IRoleService {
    List<Role> findAll();

    public List<Role> selectRoleList();
}
