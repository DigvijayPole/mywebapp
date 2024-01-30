package com.example.BackendProject.Controller;

import com.example.BackendProject.Dto.UserDto;
import com.example.BackendProject.Entity.UserEntity;
import com.example.BackendProject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("*")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/user")
    public UserEntity addUser(@RequestBody UserDto userDto){
        return userService.addUser(userDto);
    }

    @GetMapping("/user")
    public List<UserEntity> getUsers(){
        return userService.getUser();
    }

}
