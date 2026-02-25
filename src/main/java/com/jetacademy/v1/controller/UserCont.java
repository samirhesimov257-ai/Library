package com.jetacademy.v1.controller;

import com.jetacademy.v1.dto.request.UserReqDto;
import com.jetacademy.v1.service.UserSer;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
@Tag(name = "user controller")
public class UserCont {
    private final UserSer service;


    @PostMapping
    public void addUser(@Valid @RequestBody UserReqDto dto){
        service.saveUser(dto);
    }


}
