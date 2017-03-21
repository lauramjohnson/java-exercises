package org.launchcode.java.demos.java4python.prework.University;

/**
 * Created by laura on 3/20/2017.
 */
public class Grad extends Student {
    private String advisor;

    public Grad(String name){
        super();
        this.setName(name);
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }
}
