package com.sj.service.role.impl;

import com.sj.domain.role.Role;
import com.sj.service.role.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements IRoleService {

//    @Autowired
//    private RoleMapper roleMapper;

    /**
     * 根据角色名称查询对应的角色信息
     * @param roleName 角色名称
     * @return
     */
    @Override
    public Role findRoleByRoleName(String roleName){
        return null;
     }
}
