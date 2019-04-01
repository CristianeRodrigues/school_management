/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_management;

import java.util.Date;

/**
 *
 * @author Cristiane
 */
public class Student {

    String name;
    long ID;
    Date born;

    
     public String getName() {
        return this.name;
    }
     
    public void setName(String name) {
        if (name.length() > 0){
         this.name = name;
        System.out.println("Valid name");  
        }  
    }
    
    public void setID(long ID) {
        this.ID = ID;
    }

    public long getID() {
        return this.ID;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public Date getBorn() {
        return this.born;
    }
}
