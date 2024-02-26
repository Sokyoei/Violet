package com.ahri.violetbackend.controller;

import com.ahri.violetbackend.domain.Role;
import com.ahri.violetbackend.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    private IRoleService roleService;

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/roles")
    public List<Role> getRoles() {
        return roleService.findAll();
    }
}
