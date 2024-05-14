package com.ljy.springbootserver.mybatis.mapper;

import com.ljy.springbootserver.mybatis.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    public User findById(String id);

    @Select("SELECT * FROM user WHERE mobile = #{mobile} AND pwd = #{pwd}")
    public User login(@Param("mobile") String mobile, @Param("pwd") String pwd);

    @Insert("INSERT INTO user (id, name, pwd,mobile) VALUES (#{id}, #{name}, #{pwd},#{mobile})")
    public int signup(@Param("id") String id, @Param("name") String name, @Param("pwd") String pwd,@Param("mobile")String  mobile);
}
