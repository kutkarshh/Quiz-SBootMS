package com.question.services;

import java.util.List;

import com.question.entities.Question;

public interface QuestionService {

    Question addQuestion(Question question);

    List<Question> getAllQuestion();

    Question getQuestionByID(Long id);

    List<Question> getAllQuestionByQuizId(Long quizId);
}
