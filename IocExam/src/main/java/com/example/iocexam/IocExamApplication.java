package com.example.iocexam;

import com.example.iocexam.controller.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IocExamApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(IocExamApplication.class, args);
    }

    @Autowired // 필드 기반 주입
    UserController userController;

    @Override
    public void run(String... args) throws Exception {
        userController.joinUser();
    }
}
