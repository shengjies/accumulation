package com.sj.shiro.service.test2;

import com.sj.shiro.domain.User;
import com.sj.shiro.mapper.test2.Test2UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * test2 数据源用户操作
 */
@Slf4j
@Service
public class Test2UserServiceImpl implements ITest2UserService {

    @Autowired
    private Test2UserMapper test2UesrMapper;
    /**
     * 查询所以用户信息
     * @return
     */
    @Override
    public List<User> selectTest1AllUser() {
        log.info("查询数据源test2所有用户信息");
        return test2UesrMapper.selectTest1All();
    }
}
