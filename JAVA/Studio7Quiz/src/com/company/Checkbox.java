package com.company;

import java.util.Scanner;

public class Checkbox extends Question {


    public Checkbox(String question, String correctAnswer, String questionType){
        super(question, correctAnswer, questionType);
    }

    public int askQuestion() {
        int score = 0;
        Scanner input = new Scanner(System.in);
        System.out.println(this.getQuestionType() + "\n" + this.getQuestion() + "\nPress Enter to Continue:");
        String answer = input.nextLine();
        if(answer != null) {
            score ++;
            System.out.println("CORRECT\n");
        }else{
            System.out.println("Not this time!\n");
        }
        return score;
    }
}
