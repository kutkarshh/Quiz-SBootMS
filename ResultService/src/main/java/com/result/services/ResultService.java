package com.result.services;

import java.util.List;

import com.result.entities.Result;

public interface ResultService {
    Result saveResult(Result result);

    List<Result> getResultsByUser(Long userId);

    Result getResult(Long resultId);
}
