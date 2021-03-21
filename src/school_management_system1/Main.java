/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_management_system1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RASHMI
 */
public class Main {

    public static void main(String[] args) {
        Teacher Amali = new Teacher(1, "Amali", 40000);
        Teacher Kamal = new Teacher(2, "Kamal", 50000);
        Teacher Sunil = new Teacher(3, "Sunil", 45000);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Sunil);
        teacherList.add(Kamal);
        teacherList.add(Amali);

        //   Student kavi=new Student(1,"Kavi",4);
        Student Kavi = new Student(1, "Kavi", 4);
        Student Chamal = new Student(2, "Chamal", 8);
        Student Pawani = new Student(3, "Pawani", 12);
        List <Student> studenentList=new ArrayList<>();
        studenentList.add(Kavi);
        studenentList.add(Chamal);
        studenentList.add(Pawani);

        //School NIBM = new School(teacherList,studenentList);
        School NIBM=new School(teacherList,studenentList);
       
        Kavi.payfees(50000);
        //System.out.println("NIBM has earned Rs"+  NIBM.getTotalMoneyEarned());
        Chamal.payfees(60000);
        
        System.out.println("NIBM has earned Rs"+  NIBM.getTotalMoneyEarned());
        
        System.out.println("----NIBM SALARY SHEET------");
        Sunil.receiveSalary(Sunil.getSalary());
        System.out.println("NIBM has spent for salary to "+Sunil.getName()+" And now NIBM has "+NIBM.getTotalMoneyEarned());
        

    }

}
