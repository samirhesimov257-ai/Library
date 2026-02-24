package com.jetacademy.v1.service;

import com.jetacademy.v1.dao.repository.AuthorRepo;
import com.jetacademy.v1.dao.repository.BookRepo;
import com.jetacademy.v1.dao.repository.ReviewAuthorRepo;
import com.jetacademy.v1.dao.repository.ReviewBookRepo;
import com.jetacademy.v1.dto.request.AuthorReqDto;
import com.jetacademy.v1.dto.request.BookReqDto;
import com.jetacademy.v1.dto.request.ReviewAuthorReqDto;
import com.jetacademy.v1.dto.request.ReviewBookReqDto;
import com.jetacademy.v1.dto.responce.AuthorResDto;
import com.jetacademy.v1.exception.AuthorNotFoundException;
import com.jetacademy.v1.mapper.AuthorMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthorService {
    private final AuthorRepo repo;
    private final BookRepo bookRepo;
    private final ReviewAuthorRepo reviewAuthorRepo;
    private final ReviewBookRepo reviewBookRepo;
    private final AuthorMapper mapper;

    public AuthorResDto showAuthor(Long id) {
        return mapper.toDto(repo.findById(id).orElseThrow(
                ()->{
                    log.warn("Author not found {}",id);
                    throw new AuthorNotFoundException("Tapilmadi");
                }
        ));
    }


    public void saveAuthor(AuthorReqDto dto) {
        repo.save(mapper.toEntity(dto));
    }

    public void saveBook(BookReqDto dto) {
        bookRepo.save(mapper.toEntity(dto));
    }

    public void saveReviewBook(ReviewBookReqDto dto) {
        reviewBookRepo.save(mapper.toEntityReviewB(dto));
    }

    public void saveReviewAuthor(ReviewAuthorReqDto dto) {
        reviewAuthorRepo.save(mapper.toEntityReviewA(dto));
    }


}
