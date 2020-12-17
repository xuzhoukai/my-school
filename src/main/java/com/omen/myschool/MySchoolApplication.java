package com.omen.myschool;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan("com.omen.myschool.mapper")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MySchoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySchoolApplication.class, args);
    }

}
