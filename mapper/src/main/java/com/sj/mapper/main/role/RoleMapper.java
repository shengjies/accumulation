package com.sj.mapper.main.role;

import com.sj.domain.role.Role;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    /**
     * 根据角色名称查询对应的角色信息
     * @param roleName 角色名称
     * @return
     */
    Role findRoleByRoleName(@Param("roleName")String roleName);
}
