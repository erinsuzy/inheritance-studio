package org.example;

import java.util.ArrayList;

public class Checkbox extends Question{
    public Checkbox(String text, ArrayList<String> possibleAnswers) {
        super(text, possibleAnswers);
    }

    @Override
    public boolean isCorrect() {
        return true;
    }


}
