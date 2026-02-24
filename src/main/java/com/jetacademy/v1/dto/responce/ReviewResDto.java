package com.jetacademy.v1.dto.responce;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public class ReviewResDto {
    private String comment;
    private Double rating;
}
