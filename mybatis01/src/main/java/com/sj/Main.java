package com.sj;




import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sj.domain.User;
import com.sj.mapper.UserMapper;
import com.sj.utils.ConnectionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SqlSession sqlSession = ConnectionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        PageHelper.startPage(1, 3, true);
        Page<User> page = (Page<User>) userMapper.selectAllUser();
        System.out.println(page.getTotal());
        List<User> users = page.getResult();
        for (User user : users) {
            System.out.println(user);
        }
        ConnectionUtils.colseSqlSessin(sqlSession);
    }
}
