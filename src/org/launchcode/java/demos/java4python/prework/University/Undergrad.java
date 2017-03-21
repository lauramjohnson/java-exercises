package org.launchcode.java.demos.java4python.prework.University;

/**
 * Created by laura on 3/20/2017.
 */
public class Undergrad extends Student{
    private String classification;

    public Undergrad(String name){
        super();
        this.setName(name);

    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
}
