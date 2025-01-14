package com.sibesc.rede_sibesc.controller;

import com.sibesc.rede_sibesc.entity.User;
import com.sibesc.rede_sibesc.entity.dtos.FindByNameDTO;
import com.sibesc.rede_sibesc.entity.dtos.UserRegisterDTO;
import com.sibesc.rede_sibesc.entity.mappers.UserMapper;
import com.sibesc.rede_sibesc.repository.UserRepository;
import com.sibesc.rede_sibesc.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;
    private final UserService userService;
    private final UserMapper userMapper;

    @PostMapping
    public ResponseEntity<Object> userRegister(@RequestBody UserRegisterDTO dto){
        var user = userMapper.toEntity(dto);
        userService.save(user);
        return ResponseEntity.created(null).build();
    }

    @GetMapping
    public Page<User> findByName(@RequestBody FindByNameDTO dto){

        User userExample = new User();
        userExample.setName(dto.name());

        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreNullValues()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<User> userExample1 = Example.of(userExample, matcher);

        Pageable pageRequest = PageRequest.of(dto.page(), dto.itensPerPage());
        return userRepository.findAll(userExample1, pageRequest);
    }
}
