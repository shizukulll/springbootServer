package com.ljy.springbootserver.mybatis.mapper;
import com.ljy.springbootserver.mybatis.pojo.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductMapper {

    @Insert("INSERT INTO product (name, price, count, brand) VALUES (#{name}, #{price}, #{count}, #{brand})")
    int insert(Product product);

    @Delete("DELETE FROM product WHERE id = #{id}")
    int delete(int id);

    @Update("UPDATE product SET name = #{name}, price = #{price}, count = #{count}, brand = #{brand} WHERE id = #{id}")
    int update(Product product);

    @Select("SELECT * FROM product WHERE id = #{id}")
    Product selectById(int id);

    @Select("SELECT * FROM product WHERE name like #{name}")
    List<Product> selectByName(String name);

    @Select("SELECT * FROM product")
    List<Product> selectAll();
}

