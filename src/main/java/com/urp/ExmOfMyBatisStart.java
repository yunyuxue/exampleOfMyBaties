package com.urp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author AlaneyS
 * @Date 2019/6/22 9:10
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
@MapperScan(basePackages = "com.urp.mapper")
@SpringBootApplication
public class ExmOfMyBatisStart {
    public static void main(String[] args) {
        SpringApplication.run(ExmOfMyBatisStart.class, args);
    }
}
