package com.report.services.impl;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.report.entities.Result;

@FeignClient(name = "RESULT-SERVICE")
public interface ResultClient {

    @GetMapping("/result/user/{userId}")
    List<Result> getResultsByUser(@PathVariable Long userId);
}
