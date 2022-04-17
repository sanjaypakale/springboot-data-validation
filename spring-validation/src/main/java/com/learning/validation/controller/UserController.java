package com.learning.validation.controller;

import com.learning.validation.dto.UserDto;
import com.learning.validation.entity.UserEntity;
import com.learning.validation.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<UserEntity> saveUser(@RequestBody @Valid UserDto userDto){
        UserEntity user = userService.saveUser(userDto);

        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
