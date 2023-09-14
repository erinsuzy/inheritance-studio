package org.example;

import java.util.ArrayList;

public class Checkbox extends Question{
    public Checkbox(ArrayList<String> text, ArrayList<String> possibleAnswers) {
        super(text, possibleAnswers);
    }

    @Override
    public boolean checkAnswer() {
        return false;
    }
}
