package org.launchcode.java.demos.java4python.prework;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by laura on 2/28/2017.
 */
public class FiveLetterWords {
    public static void main (String [] args){
        ArrayList<String> listofwords = new ArrayList<>(Arrays.asList("hi","goodbye","hello","adios","there"
        ,"what else","friend","bloop"));

        for (String word : listofwords){
            if (word.length()==5){
                System.out.println(word);
            }
        }
    }
}
