/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.model;

/**
 *
 * @author INT105
 */
public class Student {
    private int sidId;
    private String firstname;
    private String lestname;

    public Student() {
    }

    public Student(int sidId, String fristname, String lastname) {
        this.sidId = sidId;
        this.firstname = fristname;
        this.lestname = lastname;
    }

    public int getSidId() {
        return sidId;
    }

    public void setSidId(int sidId) {
        this.sidId = sidId;
    }

    public String getFristname() {
        return firstname;
    }

    public void setFristname(String fristname) {
        this.firstname = fristname;
    }

    public String getLastname() {
        return lestname;
    }

    public void setLastname(String lastname) {
        this.lestname = lastname;
    }
    
    
    
}
