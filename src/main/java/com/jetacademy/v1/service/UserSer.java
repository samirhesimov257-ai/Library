package com.jetacademy.v1.service;

import com.jetacademy.v1.dao.repository.UserRepo;
import com.jetacademy.v1.dto.request.UserReqDto;
import com.jetacademy.v1.mapper.UserMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserSer {
    private final UserRepo repo;
    private final UserMapper mapper;

    @Transactional
    public void saveUser(UserReqDto dto) {
        repo.save(mapper.toEnt(dto));
        if (dto.getAge() < 18) throw new RuntimeException("Yashi balacadir");
    }
}
