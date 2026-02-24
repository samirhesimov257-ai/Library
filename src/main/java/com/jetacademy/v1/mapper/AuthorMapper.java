package com.jetacademy.v1.mapper;

import com.jetacademy.v1.dao.entity.Author;
import com.jetacademy.v1.dao.entity.Book;
import com.jetacademy.v1.dao.entity.ReviewAuthorEnt;
import com.jetacademy.v1.dao.entity.ReviewBookEnt;
import com.jetacademy.v1.dto.request.AuthorReqDto;
import com.jetacademy.v1.dto.request.BookReqDto;
import com.jetacademy.v1.dto.request.ReviewAuthorReqDto;
import com.jetacademy.v1.dto.request.ReviewBookReqDto;
import com.jetacademy.v1.dto.responce.AuthorResDto;
import com.jetacademy.v1.dto.responce.BookResDto;
import com.jetacademy.v1.dto.responce.CategoryResDto;
import com.jetacademy.v1.dto.responce.ReviewResDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
    Author toEntity(AuthorReqDto dto);

    @Mapping(target = "author", source = "author_id", qualifiedByName = "mapAuthor")
    Book toEntity(BookReqDto dto);
    @Named("mapAuthor")
    default Author mapAuthor(Long id) {
        if (id == null) return null;
        Author a = new Author();
        a.setId(id);
        return a;
    }

    @Mapping(target="book",source = "book_id",qualifiedByName = "mapReviewB")
    ReviewBookEnt toEntityReviewB(ReviewBookReqDto dto);
    @Named("mapReviewB")
    default Book mapReviewB(Long id){
        Book a= new Book();
        a.setId(id);
        return a;
    }

    @Mapping(target= "author",source = "author_id",qualifiedByName = "mapReviewAuthor")
    ReviewAuthorEnt toEntityReviewA(ReviewAuthorReqDto dto);
    @Named("mapReviewAuthor")
    default Author mapReviewAuthor(Long id){
        Author a= new Author();
        a.setId(id);
        return a;
    }



    AuthorResDto toDto(Author ent);
    List<BookResDto> lBDto(List<BookResDto> a);
    List<CategoryResDto> lCdto(List<CategoryResDto> b);
    List<ReviewResDto> lRDto(List<ReviewResDto> c);



}
