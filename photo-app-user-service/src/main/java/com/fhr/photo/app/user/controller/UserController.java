package com.fhr.photo.app.user.controller;

import com.fhr.photo.app.user.model.Account;
import com.fhr.photo.app.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/status/check")
    public String status() {
        return "Working fine!";
    }

    @GetMapping("/user-accounts")
    public List<Account> getUserAccounts() {
        return userService.getAccounts();
    }
}
