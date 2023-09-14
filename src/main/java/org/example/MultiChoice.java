package org.example;


import java.util.ArrayList;

public class MultiChoice extends Question{
    public MultiChoice(String text, ArrayList<String> possibleAnswers) {
        super(text, possibleAnswers);
    }

    @Override
    public boolean isCorrect() {
        return true;
    }


}
