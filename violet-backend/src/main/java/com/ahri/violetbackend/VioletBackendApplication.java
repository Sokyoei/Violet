package com.ahri.violetbackend;

// import org.mybatis.spring.annotation.MapperScan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")
@MapperScan(basePackages = {"com.ahri.violetbackend.mapper"})
public class VioletBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(VioletBackendApplication.class, args);
    }
}
