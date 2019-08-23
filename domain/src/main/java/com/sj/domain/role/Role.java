package com.sj.domain.role;

/**
 * 角色数据表
 */
public class Role {
    private int id;
    /** 角色名称 */
    private String roleName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
