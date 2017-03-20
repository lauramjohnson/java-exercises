package org.launchcode.java.demos.java4python.studio;

import org.launchcode.java.demos.java4python.prework.HashMapExc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Laura on 3/2/2017.
 */
public class CountingCharacters {
    public static void main(String[] args) {
        System.out.println("Give me a phrase!");
        Scanner in = new Scanner(System.in);
        String myString = in.nextLine();


        HashMap<Character, Integer> allChars = new HashMap<>();
        System.out.println(myString.length());
        for (int i = 0; i < myString.length(); i++) {
            Character keyChar = Character.toUpperCase(myString.charAt(i));
            if (Character.isAlphabetic(keyChar)) {
                if (allChars.containsKey(keyChar)) {
                    allChars.put(keyChar, allChars.get(keyChar) + 1);
                } else {
                    allChars.put(keyChar, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> letter : allChars.entrySet()){
            System.out.println(letter.getKey() + ": " + letter.getValue());
        }
    }
}
