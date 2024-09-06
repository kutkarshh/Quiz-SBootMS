package com.question.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.entities.Question;
import com.question.services.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    // Create Question
    @PostMapping
    public Question addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }

    // Get All Question
    @GetMapping
    public List<Question> getAllQuestion() {
        return questionService.getAllQuestion();
    }

    // Get Question By Id
    @GetMapping("/{questionId}")
    public Question getQuestion(@PathVariable Long questionId) {
        return questionService.getQuestionByID(questionId);
    }

    // Get All Question By Specific Quiz using Quiz Id
    @GetMapping("/quiz/{quizId}")
    public List<Question> getAllByQuizId(@PathVariable Long quizId) {
        return questionService.getAllQuestionByQuizId(quizId);
    }

}
