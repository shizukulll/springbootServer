package com.ljy.springbootserver.mybatis.service;

import com.ljy.springbootserver.mybatis.pojo.Product;

import java.util.List;

public interface ProductService {

    public boolean insert(Product product);
    public boolean delete(int id);
    public Product update(Product product);
    public Product readById(int id);
    public List<Product> readByName(String name);
    public List<Product> readAll();

}
