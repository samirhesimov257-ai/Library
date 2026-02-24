package com.jetacademy.v1.dto.responce;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class AuthorResDto {

    private String authorName;
    private Integer age;
    private List<ReviewResDto> reviewAuthorEntList  ;
    private List<BookResDto> bookList ;
}
