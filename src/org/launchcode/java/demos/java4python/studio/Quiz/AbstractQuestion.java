package org.launchcode.java.demos.java4python.studio.Quiz;

import java.util.ArrayList;

/**
 * Created by Laura on 3/20/2017.
 */
public abstract class AbstractQuestion {
    private ArrayList<String> correctAnswer;
    private String question;
    private int id;
    private ArrayList<String> choices;

    private static int idGenerator = 1;

    public void setCorrectAnswer(ArrayList<String> correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setChoices(ArrayList<String> choices) {
        this.choices = choices;
    }

    public AbstractQuestion(ArrayList correctAnswer, String question, ArrayList choices){
        this.id = idGenerator;
        idGenerator++;
        this.correctAnswer = correctAnswer;
        this.question = question;
        this.choices = choices;
    }

    public ArrayList<String> getCorrectAnswer() {
        return correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }
}
