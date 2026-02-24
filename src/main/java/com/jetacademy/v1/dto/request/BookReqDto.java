package com.jetacademy.v1.dto.request;

import com.jetacademy.v1.dto.responce.ReviewResDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookReqDto {
    String title;
    String stock;
    String price;
    LocalDate releaseDate;
    Long author_id;

}
