package com.ljy.springbootserver.mybatis.dto;

public class ProductRequest {
    private int id;
    private String name;
    private double price;
    private int count;
    private String brand;

    public ProductRequest(int id, String name, double price, int count, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
        this.brand = brand;
    }

    public ProductRequest() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "ProductRequest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", brand='" + brand + '\'' +
                '}';
    }
}

