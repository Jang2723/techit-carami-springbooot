package com.example.iocexam.controller;

import com.example.iocexam.domain.User;
import com.example.iocexam.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void joinUser(){
        // 클라이언트에서 보낸 값을 이용

        User user = new User();
        user.setEmail("aaa@gmail.com");
        user.setName("Alex");
        user.setPassword("1234");

        userService.joinUser(user);
    }
}
