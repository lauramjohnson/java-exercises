package org.launchcode.java.demos.java4python.prework.University;

/**
 * Created by laura on 3/19/2017.
 */
public class Program {
    public static void main (String [] args) {

        Student Laura = new Undergrad("Laura Johnson");
        System.out.println(Laura.getName());
        System.out.println(Laura.getStudentId());

        Student Dan = new Undergrad("Dan Johnson");
        System.out.println(Dan.getName());
        System.out.println(Dan.getStudentId());
    }
}
