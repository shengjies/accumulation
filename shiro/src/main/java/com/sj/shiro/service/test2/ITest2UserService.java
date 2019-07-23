package com.sj.shiro.service.test2;

import com.sj.shiro.domain.User;

import java.util.List;

/**
 * test 2数据源用户操作
 */
public interface ITest2UserService {
    /**
     * 查询数据源test2所以用户
     * @return
     */
    List<User> selectTest1AllUser();
}
