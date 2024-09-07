package com.quiz.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.entities.Question;

// @FeignClient(url = "http://localhost:8082", value = "Question-Client")

// Now Using Load Balancer with Eureka Server and Microservices Architecture
@FeignClient(name = "Question-Service")
public interface QuestionClient {

    @GetMapping("/question/quiz/{quizId}")
    List<Question> getAllQuestionsOfQuiz(@PathVariable Long quizId);

}
