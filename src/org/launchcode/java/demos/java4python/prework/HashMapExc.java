package org.launchcode.java.demos.java4python.prework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by laura on 2/28/2017.
 */
public class HashMapExc {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = in.nextInt();
                students.put(newID, newStudent);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");


        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");

        }
    }
}



