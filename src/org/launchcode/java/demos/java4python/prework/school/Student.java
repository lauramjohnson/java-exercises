package org.launchcode.java.demos.java4python.prework.school;

import java.util.Date;

/**
 * Created by laura on 3/12/2017.
 */
public class Student {

    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;
    private Date dateAdded;

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getStudentID() {
        return studentId;
    }

    public Student(int studentID) {
        this.studentId = studentID;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    private void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    private void setGpa(double aGpa) {
        gpa = aGpa;
    }
}
