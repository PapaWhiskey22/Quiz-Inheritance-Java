package org.example;
import java.util.ArrayList;

public class Checkbox extends Question {
    ArrayList<String> correctAnswers = new ArrayList<String>();

    public Checkbox(String prompt, ArrayList<String> answers, ArrayList<String> correctAnswers) {
        super(prompt, answers, correctAnswers);
        this.correctAnswers = correctAnswers;
    }

    @Override
    public ArrayList<String> getAnswers(){
        return correctAnswers;
    }
}