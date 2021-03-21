/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_management_system1;

/**
 *
 * @author RASHMI
 */
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feespaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feespaid = 0;
        this.feesTotal = 20000;

    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void payfees(int fees) {
        feespaid = feespaid + fees;
        School.updateTotalMoneyEarned(feespaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeespaid() {
        return feespaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(int fees) {
        return feesTotal-feespaid;
        
    }
}
