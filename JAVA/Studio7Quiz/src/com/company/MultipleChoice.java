package com.company;

import java.util.Scanner;

public class MultipleChoice extends Question {
    public String choices;


    public MultipleChoice(String question, String correctAnswer, String questionType, String choices){
        super(question, correctAnswer, questionType);
        this.choices = choices;
    }

    public int askQuestion() {
        int score = 0;
        Scanner input = new Scanner(System.in);
        System.out.println(this.getQuestionType() + "\n" + this.getQuestion() + this.choices);
        String answer = input.nextLine();
        if(answer.equals(this.getCorrectAnswer())) {
            score ++;
            System.out.println("CORRECT\n");
        }else{
            System.out.println("Not this time!\n");
        }
        return score;
    }
}