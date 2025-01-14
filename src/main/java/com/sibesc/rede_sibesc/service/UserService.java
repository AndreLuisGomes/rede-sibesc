package com.sibesc.rede_sibesc.service;

import com.sibesc.rede_sibesc.entity.User;
import com.sibesc.rede_sibesc.entity.dtos.UserRegisterDTO;
import com.sibesc.rede_sibesc.repository.UserRepository;
import com.sibesc.rede_sibesc.service.validator.UserValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import static org.springframework.http.ResponseEntity.status;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserValidator userValidator;

    public User save(User user){
        userValidator.validate(user);
        return userRepository.save(user);
    }
}
