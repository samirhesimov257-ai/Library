package com.jetacademy.v1.mapper;

import com.jetacademy.v1.dao.entity.PersonEnt;
import com.jetacademy.v1.dto.request.PersonReqDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    PersonEnt toEntity(PersonReqDto dto);



}
