package com.sj.shiro.mapper.test1;

import com.sj.shiro.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 数据源test1
 */
public interface UserMapper {

    @Select("SELECT * FROM tab_user")
    List<User> selectTest1All();
}
