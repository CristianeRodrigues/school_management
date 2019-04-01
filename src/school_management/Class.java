/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_management;

/**
 *
 * @author Cristiane
 */
public class Class {
    
    
    //attributes from Class class
    int code;
    String name;
    double credits;
    Student Student;

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    
    public void setCredits(double credits) {
        this.credits = credits;
    }
    
    public void StudentList(){
        System.out.println(Student.getName());
    }

    public double getCredits() {
        return this.credits;
    }
}
