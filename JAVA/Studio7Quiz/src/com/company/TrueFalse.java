package com.company;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Scanner;

public class TrueFalse extends Question {

    public String possibleAnswers;


    public TrueFalse(String question, String correctAnswer, String questionType, String possibleAnswers){
        super(question, correctAnswer, questionType);
        this.possibleAnswers = possibleAnswers;
    }

    public int askQuestion() {
        int score = 0;
        Scanner input = new Scanner(System.in);
        System.out.println(this.getQuestionType() + "\n" + this.getQuestion() + "\n" + this.possibleAnswers);
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
