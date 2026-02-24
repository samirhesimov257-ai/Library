package com.jetacademy.v1.dao.repository;

import com.jetacademy.v1.dao.entity.ReviewAuthorEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewAuthorRepo extends JpaRepository<ReviewAuthorEnt,Long> {
}
