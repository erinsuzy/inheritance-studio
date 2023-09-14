package org.example;


import java.util.ArrayList;

public class MultiChoice extends Question{
    public MultiChoice(ArrayList<String> text, ArrayList<String> possibleAnswers) {
        super(text, possibleAnswers);
    }

    @Override
    public boolean checkAnswer() {
        return false;
    }
}
