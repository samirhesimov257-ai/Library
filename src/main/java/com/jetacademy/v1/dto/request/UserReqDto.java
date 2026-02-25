package com.jetacademy.v1.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserReqDto {

   private String userName;
   private Integer age;
}
