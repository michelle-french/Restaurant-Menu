package com.company;

public abstract class Question {

    private String question;
    private String correctAnswer;
    private String questionType;

    public Question(String question, String correctAnswer, String questionType) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.questionType = questionType;
    }
    public abstract int askQuestion();

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String answer) {
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }
}