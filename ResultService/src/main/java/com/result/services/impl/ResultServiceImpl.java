package com.result.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.result.entities.Result;
import com.result.repositories.ResultRepository;
import com.result.services.ResultService;
import com.result.services.UserClient;

@Service
public class ResultServiceImpl implements ResultService {

    private ResultRepository resultRepository;
    private UserClient userClient;

    public ResultServiceImpl(ResultRepository resultRepository, UserClient userClient) {
        this.resultRepository = resultRepository;
        this.userClient = userClient;
    }

    @Override
    public Result saveResult(Result result) {
        Result newResult = resultRepository.save(result);
        newResult.setUser(userClient.getUserById(newResult.getUserId()));
        return newResult;
    }

    @Override
    public List<Result> getResultsByUser(Long userId) {
        List<Result> resultList = resultRepository.findByUserId(userId);

        // Use Stream API to set User for each result
        resultList.forEach(result -> result.setUser(userClient.getUserById(result.getUserId())));
        return resultList;
    }

    @Override
    public Result getResult(Long resultId) {
        return resultRepository.findById(resultId).orElseThrow(() -> new RuntimeException("Result not found"));
    }
}
