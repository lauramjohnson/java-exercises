package org.launchcode.java.demos.java4python.prework.University;

import java.time.LocalDateTime;

/**
 * Created by laura on 3/20/2017.
 */
public abstract class Student {
    private String name;
    private final int studentId;
    private String college;
    private String major;
    private boolean active;
    private LocalDateTime matDt;

    private static int idGenerator =1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
        this.studentId = idGenerator;
        idGenerator ++;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDateTime getMatDt() {
        return matDt;
    }

    public void setMatDt(LocalDateTime matDt) {
        this.matDt = LocalDateTime.now();
    }
}

