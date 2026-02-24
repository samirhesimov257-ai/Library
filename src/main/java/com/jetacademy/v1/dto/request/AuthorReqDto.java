package com.jetacademy.v1.dto.request;

import com.jetacademy.v1.dto.responce.BookResDto;
import com.jetacademy.v1.dto.responce.ReviewResDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor

public class AuthorReqDto {
    String authorName;
    Integer age;
}
