package com.jetacademy.v1.mapper;

import com.jetacademy.v1.dao.entity.UserEnt;
import com.jetacademy.v1.dto.request.UserReqDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserEnt toEnt(UserReqDto dto);

}
