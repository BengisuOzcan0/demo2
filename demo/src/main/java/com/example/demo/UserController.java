package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public User[] getUsers() {
        return userService.getUsers();
    }

    // Adınızı ve soyadınızı yazan bir endpoint ekleyelim
    @GetMapping("/myinfo")
    public String getMyInfo() {
        return "Bengisu Ozcan, Group: 8, Student ID: 64535";
    }
}