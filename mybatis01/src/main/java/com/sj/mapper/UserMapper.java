package com.sj.mapper;

import com.sj.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    /**
     * 查询所以用户信息
     * @return
     */
    @Select("SELECT * FROM tab_user")
    List<User> selectAllUser();
}
