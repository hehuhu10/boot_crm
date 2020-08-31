package com.xihang.boot_crm.dao;

import com.xihang.boot_crm.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
    public  User findUser(@Param("usercode") String usercode,@Param("password") String password);
}
