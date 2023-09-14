package org.example;

import java.util.ArrayList;

public abstract class Question {
    String text;

    private ArrayList<String> possibleAnswers;

    public Question(String text, ArrayList<String> possibleAnswers) {
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(ArrayList<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public abstract boolean isCorrect();
    public double grade (){
        double score = 0.0;
        return score;
    }

    public void printQuestion() {
            System.out.println(text);
        }


    public void printPossibleAnswers(){
        for (String answers : possibleAnswers) {
            System.out.println(answers);
        }

    }
}
