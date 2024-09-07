package com.result.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.result.services.ResultService;
import com.result.entities.Result;

@RestController
@RequestMapping("/result")
public class ResultController {

    private final ResultService resultService;

    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    @PostMapping
    public Result saveResult(@RequestBody Result result) {
        return resultService.saveResult(result);
    }

    @GetMapping("/user/{userId}")
    public List<Result> getResultsByUser(@PathVariable Long userId) {
        return resultService.getResultsByUser(userId);
    }

    @GetMapping("/{resultId}")
    public Result getResult(@PathVariable Long resultId) {
        return resultService.getResult(resultId);
    }
}
