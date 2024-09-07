package com.result.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.result.entities.Result;

public interface ResultRepository extends JpaRepository<Result, Long> {
    List<Result> findByUserId(Long userId);
}