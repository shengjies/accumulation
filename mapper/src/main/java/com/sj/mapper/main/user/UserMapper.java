package com.sj.mapper.main.user;

import com.sj.domain.user.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * 根据用户名称查询对应的用户信息
     * @param userName 用户名称
     * @return
     */
    User selectUser(@Param("username")String userName);
}
