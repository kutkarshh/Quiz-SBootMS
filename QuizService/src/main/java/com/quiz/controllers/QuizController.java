package com.quiz.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    // Create Quiz
    @PostMapping
    public Quiz createQuiz(@RequestBody Quiz newQuiz) {
        return quizService.addQuiz(newQuiz);
    }

    // Get All Quiz
    @GetMapping
    public List<Quiz> getAllQuizzes() {
        return quizService.get();
    }

    // Get Quiz By ID
    @GetMapping("/{id}")
    public Quiz getOne(@PathVariable Long id) {
        System.out.println(id);
        return quizService.get(id);
    }
}
