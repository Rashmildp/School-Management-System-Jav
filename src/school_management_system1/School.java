/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_management_system1;

import java.util.List;

/**
 *
 * @author RASHMI
 */
//
public class School {
    private List <Teacher> teachers;
    private List <Student> students;
    private static int  totalMoneyEarned;
    private static  int totalMoneySpent;
    
    public School(List<Teacher> teachers,List<Student> students){
        this.teachers=teachers;
        this.students=students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    
    }
    //returns the list of teachers

   

    public List<Teacher> getTeachers() {
        return teachers;
    }
    // 

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
      
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
       students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned=totalMoneyEarned+MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void UpdateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned=totalMoneyEarned-MoneySpent;
    }
    
}
