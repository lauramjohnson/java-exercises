package org.launchcode.java.demos.java4python.studio;

import java.util.Scanner;

/**
 * Created by Laura on 2/27/2017.
 */
public class Area {
    public static void main(String [] args){
        Scanner scanner;
        scanner = new Scanner(System.in);
        Double radius = 0.0;

        while (radius == 0.0){
            System.out.println("Enter a radius: ");
            radius = scanner.nextDouble();

            if (radius < 0.0) {
                System.out.println("That's a negative, dummy");
            } else {
                System.out.println("The area of a circle of radius " + radius + " is:  " + (Math.PI * Math.pow(radius, 2.0)));}
            radius = 0.0;
        }
    }
}
