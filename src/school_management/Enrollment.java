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
public class Enrollment {
    
    long enrollment;
    double[] grades;
    double coefficient;
    
    SchoolClass Class;
    Student Student;
    Discipline Discipline;
    
     public void setEnrollment(long enrollment) {
        this.enrollment = enrollment;
    }

    public long getEnrollment() {
        return this.enrollment;
    }
    public int getClassCredits(){
        return Class.credits;
    }
    
    public void setCoefficient(double[] grades){
        double sum1 = 0;
        for (int i = 0; i < grades.length; i ++){
         sum1 = sum1 + grades[i];
         double partial_result = i / sum1;
        }
        this.coefficient = sum1 /grades.length; 
    }
}
