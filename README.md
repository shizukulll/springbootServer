## 这是一个为安卓开发课设准备的服务端，使用springboot
  为了完成安卓开发的课设，我需要一个服务端来完成登录、注册、查询个人信息，货物的查询、添加、更改、删除功能。
  
### 使用的技术
  我的项目采用 Spring Boot 框架进行 Web 开发，使用 MyBatis 进行数据库操作，数据库选择 MySQL，项目管理和依赖管理则使用 Maven。

### 数据库创建
  ```SQL
CREATE DATABASE mobile  
CHARACTER SET utf8mb4  
COLLATE utf8mb4_general_ci;  
  
USE mobile;  
  
-- 创建user表  
CREATE TABLE user (  
    id VARBINARY(36) PRIMARY KEY,  
    name VARCHAR(10) NOT NULL,  
    pwd VARCHAR(10) NOT NULL,  
    mobile CHAR(11) NOT NULL  
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;  
  
-- 创建product表  
CREATE TABLE product (  
    id INT AUTO_INCREMENT PRIMARY KEY,  
    name VARCHAR(10) NOT NULL,  
    price DOUBLE(10, 2) NOT NULL, 
    count INT NOT NULL,  
    brand VARCHAR(20) NOT NULL 
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
```

### 接口测试
使用jmeter
- 注册
  
- 登录
  
- 查询所有产品
  
- 按照id查找产品
  
- 按照name查找产品
  
- 按照id删除产品
  
- 按照id修改产品
  
    
