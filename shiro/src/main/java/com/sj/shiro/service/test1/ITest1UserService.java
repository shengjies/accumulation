package com.sj.shiro.service.test1;

import com.sj.shiro.domain.User;

import java.util.List;

/**
 * test 1数据源用户操作
 */
public interface ITest1UserService {
    /**
     * 查询数据源test1所以用户
     * @return
     */
    List<User> selectTest1AllUser();
}
