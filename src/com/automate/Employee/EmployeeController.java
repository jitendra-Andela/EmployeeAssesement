package com.automate.Employee;


import java.util.List;

public class EmployeeController {

    EmployeeService empservice=new EmployeeService();

    public void createEmp(String name,int age,int id,int salary) {
        empservice.createEmployee(name,age,id,salary);
    }

    public void displayInformation()
    {

        empservice.listallEmployees();
    }

    public void deleteEmployee(int empid)
    {
        empservice.deleteEmployee(empid);
    }



    public void sortByAge()
    {
        List<EmployeeModel> employeeModelList= empservice.sortByAge();
        for(EmployeeModel e:employeeModelList)
            System.out.println(e);
    }

    public void sortByName() {
        List<EmployeeModel> employeeModelList=empservice.sortByEmpName();
        for (EmployeeModel d:employeeModelList)
            System.out.println(d);
    }

    public void sortBysalary() {
        List<EmployeeModel>employeeModelList=empservice.sortByEmpid();
        for (EmployeeModel f:employeeModelList)
            System.out.println(f);
    }

    public void updateEmployee(int emplId) {
        empservice.updateEmployee(emplId);
    }

    public void ListEmployees(int don) {
    }

}
