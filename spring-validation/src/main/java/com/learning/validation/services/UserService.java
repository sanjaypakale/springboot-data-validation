package com.learning.validation.services;

import com.learning.validation.dto.UserDto;
import com.learning.validation.entity.UserEntity;
import com.learning.validation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity saveUser(UserDto userDto) {

        UserEntity user = UserEntity.build(0L, userDto.getUsername(),
                userDto.getEmail(),
                userDto.getAge(), userDto.getAddress());
        UserEntity user1 = userRepository.save(user);
        return user1;
    }

    public List<UserEntity> getAllUser() {
        return userRepository.findAll();
    }

    public UserEntity getUserById(Integer id) {
        return userRepository.findById(id).get();
    }
}
