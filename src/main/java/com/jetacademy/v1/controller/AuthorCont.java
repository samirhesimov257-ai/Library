package com.jetacademy.v1.controller;

import com.jetacademy.v1.dto.request.AuthorReqDto;
import com.jetacademy.v1.dto.request.BookReqDto;
import com.jetacademy.v1.dto.request.ReviewAuthorReqDto;
import com.jetacademy.v1.dto.request.ReviewBookReqDto;
import com.jetacademy.v1.dto.responce.AuthorResDto;
import com.jetacademy.v1.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/author")
@RequiredArgsConstructor
public class AuthorCont {
    private final AuthorService service;

    @PostMapping("/addAut")
    public void addAuthor(@RequestBody AuthorReqDto dto){
        service.saveAuthor(dto);
    }
    @PostMapping("/addBook")
    public void addBook(@RequestBody BookReqDto dto){
        service.saveBook(dto);
    }
    @PostMapping("/addReviewB")
    public void addReviewBook(@RequestBody ReviewBookReqDto dto){
        service.saveReviewBook(dto);
    }

    @PostMapping("/addReviewA")
    public void addReviewAuthor(@RequestBody ReviewAuthorReqDto dto){
        service.saveReviewAuthor(dto);
    }




    @GetMapping("{id}")
    public AuthorResDto getAuthor(@PathVariable Long id){
     return service.showAuthor(id);
    }

}
