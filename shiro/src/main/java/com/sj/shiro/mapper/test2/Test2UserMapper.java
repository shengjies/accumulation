package com.sj.shiro.mapper.test2;

import com.sj.shiro.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 查询test2数据源中的所有用户
 */
public interface Test2UserMapper {

    @Select("SELECT * FROM tab_user")
    List<User> selectTest1All();
}
