package org.launchcode.java.demos.java4python.studio;

import java.util.Scanner;

/**
 * Created by Laura on 2/27/2017.
 */
public class HelloService {
    public static void main(String [] args){
        Scanner scanner;
        scanner = new Scanner(System.in);
        String name = "";

        while(name.equals("")) {
            System.out.println("What is your name?");
            name = scanner.next();
            System.out.println("Hello " + name);
            name = "";
        }
    }
}
