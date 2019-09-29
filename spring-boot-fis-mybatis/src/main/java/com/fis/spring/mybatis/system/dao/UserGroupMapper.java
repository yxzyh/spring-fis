package com.fis.spring.mybatis.system.dao;

import com.fis.spring.mybatis.system.entity.UserGroup;
import java.util.List;

public interface UserGroupMapper {
    /**
     */
    int deleteByPrimaryKey(Integer id);

    /**
     */
    int insert(UserGroup record);

    /**
     */
    UserGroup selectByPrimaryKey(Integer id);

    /**
     */
    List<UserGroup> selectAll();

    /**
     */
    int updateByPrimaryKey(UserGroup record);
}