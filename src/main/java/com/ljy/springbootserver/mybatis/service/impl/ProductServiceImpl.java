package com.ljy.springbootserver.mybatis.service.impl;

import com.ljy.springbootserver.mybatis.mapper.ProductMapper;
import com.ljy.springbootserver.mybatis.pojo.Product;
import com.ljy.springbootserver.mybatis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public boolean insert(Product product) {
        return productMapper.insert(product) > 0;
    }

    @Override
    public boolean delete(int id) {
        return productMapper.delete(id) > 0;
    }

    @Override
    public Product update(Product product) {
        int rowsAffected = productMapper.update(product);
        if (rowsAffected > 0) {
            return productMapper.selectById(product.getId());
        }
        return null;
    }

    @Override
    public Product readById(int id) {
        return productMapper.selectById(id);
    }

    @Override
    public List<Product> readByName(String name) {
        return productMapper.selectByName(name);
    }

    @Override
    public List<Product> readAll() {
        return productMapper.selectAll();
    }
}

