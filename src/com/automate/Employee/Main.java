package com.automate.Employee;
import java.util.Scanner;

public class Main {
    static final Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        EmployeeController empcontroller=new EmployeeController();
        int i=0;
        while(i<3) {
            System.out.println("enter employee name");
            String name = sc.next();
            System.out.println("enter employee age");
            int age = sc.nextInt();
            System.out.println("enter employee id");
            int id = sc.nextInt();
            System.out.println("enter employee salary");
            int salary = sc.nextInt();
            empcontroller.createEmp(name, age, id, salary);
            i++;
        }
        System.out.println("Employees info");
        empcontroller.displayInformation();
//delete
        System.out.println("enter empId to delete");
        int empId=sc.nextInt();
        empcontroller.deleteEmployee(empId);
        empcontroller.displayInformation();
//update
        System.out.println("enter empId to Update");
        int emplId=sc.nextInt();
        empcontroller.updateEmployee(emplId);
        empcontroller.displayInformation();

//list
        System.out.println("enter list of employees");
        int don=sc.nextInt();
        empcontroller.ListEmployees(don);
        empcontroller.displayInformation();



        System.out.println("After Sorting by Age");
        empcontroller.sortByAge();
        System.out.println("After Sorting by Name");
        empcontroller.sortByName();
        System.out.println("after sorting by empid");
        empcontroller.sortBysalary();

    }
}

