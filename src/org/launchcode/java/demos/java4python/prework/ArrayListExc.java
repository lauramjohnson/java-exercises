package org.launchcode.java.demos.java4python.prework;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by laura on 2/28/2017.
 */
public class ArrayListExc {
    public static void main (String [] args){
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,2,3,3,3,4,4,4,4,5,5,5,5,5));
        Integer total = 0;

        for (Integer item : list1) {
            total += item;
        }

        System.out.println(total);
    }
}

