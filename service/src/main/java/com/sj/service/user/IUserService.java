package com.sj.service.user;

import com.sj.domain.user.User;

/**
 * 用户相关操作
 */
public interface IUserService {
    /**
     * 根据用户名称查询对应的用户信息
     * @param userName 用户名称
     * @return
     */
    User findUserByUserName(String userName);
}
