package com.sj.web.controller.role;

import com.sj.domain.role.Role;
import com.sj.service.role.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @Autowired
    private IRoleService roleService;

    @RequestMapping("/role")
    public Role findRoleByRoleName(){
        return roleService.findRoleByRoleName("管理员");
    }
}
