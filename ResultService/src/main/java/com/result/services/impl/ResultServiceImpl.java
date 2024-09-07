package com.result.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.result.entities.Result;
import com.result.repositories.ResultRepository;
import com.result.services.ResultService;


@Service
public class ResultServiceImpl implements ResultService {

    private ResultRepository resultRepository;

    public ResultServiceImpl(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @Override
    public Result saveResult(Result result) {
        return resultRepository.save(result);
    }

    @Override
    public List<Result> getResultsByUser(Long userId) {
        return resultRepository.findByUserId(userId);
    }

    @Override
    public Result getResult(Long resultId) {
        return resultRepository.findById(resultId).orElseThrow(() -> new RuntimeException("Result not found"));
    }
}
