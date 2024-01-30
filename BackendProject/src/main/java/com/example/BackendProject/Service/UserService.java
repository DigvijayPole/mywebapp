package com.example.BackendProject.Service;

import com.example.BackendProject.Dto.UserDto;
import com.example.BackendProject.Entity.UserEntity;
import com.example.BackendProject.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public UserEntity addUser(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setFname(userDto.getFname());
        userEntity.setLname(userDto.getLname());
        userEntity.setContactNo(userDto.getContactNo());
        userEntity.setGender(userDto.getGender());
        userEntity.setEmail(userDto.getEmail());
        return userRepository.save(userEntity);
    }

    public List<UserEntity> getUser() {
        return userRepository.findAll();
    }
}
