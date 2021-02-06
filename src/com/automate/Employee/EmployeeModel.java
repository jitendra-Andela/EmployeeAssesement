package com.automate.Employee;

public class EmployeeModel {
    String ename;
    int empid;
    int age;
    int salary;


    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEname() {
        return ename;
    }

    public int getEmpid() {
        return empid;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "ename='" + ename + '\'' +
                ", age=" + age +
                ", empid=" + empid +
                ", salary=" + salary +
                '}';
    }

    }



