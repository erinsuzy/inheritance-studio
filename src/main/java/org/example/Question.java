package org.example;

import java.util.ArrayList;

public abstract class Question {
    private ArrayList<String> text;

    private ArrayList<String> possibleAnswers;

    public Question(ArrayList<String> text, ArrayList<String> possibleAnswers) {
    }


    public ArrayList<String> getText() {
        return text;
    }

    public void setText(ArrayList<String> text) {
        this.text = text;
    }

    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(ArrayList<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public abstract boolean checkAnswer();
    public double grade (){
        return grade();
    }

    public void printQuestion() {
    }

    public void printAnswer(){

    }
}
