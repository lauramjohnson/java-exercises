package org.launchcode.java.demos.java4python.studio.Quiz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Laura on 3/20/2017.
 */
public class QuizTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hello there!");

        String question = "What is 2+2?";
        ArrayList choices = new ArrayList<>();
        choices.add("A: 2");
        choices.add("B: 3");
        choices.add("C: 4");
        choices.add("D: 5");
        ArrayList answer = new ArrayList<>();
        answer.add("A");

        AbstractQuestion one = new MultipleChoice(answer, question, choices);
        System.out.print(one.getQuestion());
        System.out.print(one.getQuestion());
        System.out.print(one.getQuestion());

        ArrayList<String> student = new ArrayList();
        
    }
}
