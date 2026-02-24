package com.jetacademy.v1.dto.responce;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class BookResDto {
    private String title;
    private String stock;
    private String price;
    private LocalDate releaseDate;
    private List<ReviewResDto> reviewBookEnts ;

}
