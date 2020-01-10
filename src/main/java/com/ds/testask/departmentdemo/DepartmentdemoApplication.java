package com.ds.testask.departmentdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DepartmentdemoApplication {


    @Autowired

    public static void main(String[] args) {
        SpringApplication.run(DepartmentdemoApplication.class, args);
    }


}
