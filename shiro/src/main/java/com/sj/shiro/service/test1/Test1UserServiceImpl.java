package com.sj.shiro.service.test1;

import com.sj.shiro.domain.User;
import com.sj.shiro.mapper.test1.UserMapper;
import com.sj.shiro.service.test1.ITest1UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * test1 数据源用户操作
 */
@Slf4j
@Service
public class Test1UserServiceImpl implements ITest1UserService {

    @Autowired
    private UserMapper userMapper;
    /**
     * 查询所以用户信息
     * @return
     */
    @Override
    public List<User> selectTest1AllUser() {
        log.info("查询数据源test1所有用户信息");
        return userMapper.selectTest1All();
    }
}
