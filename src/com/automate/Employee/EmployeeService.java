package com.automate.Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeService {
    EmployeeRepository employeeRepository=new EmployeeRepository();

    public  void createEmployee(String name,int id,int age,int salary)
    {
        EmployeeModel employee=new EmployeeModel();
        employee.setAge(age);
        employee.setEmpid(id);
        employee.setEname(name);
        employee.setSalary(salary);


        employeeRepository.saveEmployee(employee);
    }


    public void  listallEmployees()
    {
//        List<EmployeeModel> EmployeeList= employeeRepository.fetchAll();
//        for(EmployeeModel emp:EmployeeList) System.out.println(emp);
        List<EmployeeModel> EmployeeList = employeeRepository.fetchAll();
        for(EmployeeModel emp:EmployeeList) System.out.println(emp);
    }


    public void deleteEmployee(int empid)
    {
        List<EmployeeModel> emplist=employeeRepository.fetchAll();
        for(EmployeeModel emp:emplist)
        {
            if(emp.getEmpid()==empid)
                emplist.remove(emp);
        }
    }


    public void updateEmployee(int emplId) {
        List<EmployeeModel> emplist=employeeRepository.fetchAll();
        for(EmployeeModel emp:emplist)
        {
            if(emp.getEmpid()==emplId);
        }
    }


    public List<EmployeeModel> sortByAge()
    {
        List<EmployeeModel> emplist=employeeRepository.fetchAll();
        Collections.sort(emplist, new Comparator<EmployeeModel>() {
            @Override
            public int compare(EmployeeModel o1, EmployeeModel o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        return emplist;
    }


    public List<EmployeeModel> sortByEmpid()
    {
        List<EmployeeModel> emplist=employeeRepository.fetchAll();
        Collections.sort(emplist, new Comparator<EmployeeModel>() {
            @Override
            public int compare(EmployeeModel o1, EmployeeModel o2) {
                return o1.getEmpid()-o2.getEmpid();
            }
        });
        return emplist;
    }


    public List<EmployeeModel> sortByEmpName()
    {
        List<EmployeeModel> emplist=employeeRepository.fetchAll();
        Collections.sort(emplist, new Comparator<EmployeeModel>() {
            @Override
            public int compare(EmployeeModel o1, EmployeeModel o2) {
                return o1.getEname().compareTo(o2.getEname());
            }
        });
        return emplist;
    }


    public List<EmployeeModel> sortBysalary()
    {
        List<EmployeeModel> emplist=employeeRepository.fetchAll();
        Collections.sort(emplist, new Comparator<EmployeeModel>() {
            @Override
            public int compare(EmployeeModel o1, EmployeeModel o2) {
                return 0;
            }
        });
        return emplist;
    }
}


