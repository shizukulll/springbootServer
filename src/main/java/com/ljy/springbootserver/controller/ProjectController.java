package com.ljy.springbootserver.controller;

import com.ljy.springbootserver.mybatis.dto.ProductRequest;
import com.ljy.springbootserver.mybatis.pojo.Product;
import com.ljy.springbootserver.mybatis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequestMapping("/mobile")
@RestController
public class ProjectController {

    @Autowired
    private ProductService productService;


    @RequestMapping("/product/insert")
    public boolean insert(@RequestBody ProductRequest request){
        Product product = new Product(request.getName(),request.getPrice(),request.getCount(),request.getBrand());
        return productService.insert(product);
    }

    @RequestMapping("/product/delete")
    public boolean delete(int id){

        return productService.delete(id);
    }
    @RequestMapping("/product/update")
    public Product update(@RequestParam int id, @RequestParam String name, @RequestParam double price, @RequestParam int count, @RequestParam String brand){

        Product product = new Product(id,name,price,count,brand);
        System.out.println(product.toString());
        return productService.update(product);
    }
    @RequestMapping("/product/readById")
    public Product readById(int id){
        return productService.readById(id);
    }

    @RequestMapping("/product/readByName")
    public List<Product> readByName(String name){
        return productService.readByName(name);
    }

    @RequestMapping("/product/readAll")
    public List<Product> readAll(){
        return productService.readAll();
    }
}
