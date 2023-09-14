package org.example;

import java.util.ArrayList;

public class TrueFalse extends Question{
    public TrueFalse(String text, ArrayList<String> possibleAnswers) {
        super(text, possibleAnswers);

    }

    @Override
    public boolean isCorrect() {
        return true;
    }




}
