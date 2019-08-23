package com.sj.service.role;

import com.sj.domain.role.Role;

/**
 * 角色相关操作
 */
public interface IRoleService {
    /**
     * 根据角色名称查询对应的角色信息
     * @param roleName 角色名称
     * @return
     */
    Role findRoleByRoleName(String roleName);
}
