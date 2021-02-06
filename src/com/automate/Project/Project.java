package com.automate.Project;

import java.util.Date;
import java.util.Scanner;

public class Project {
    static final Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        ProjectController projectController=new ProjectController();
        int i=0;
        while(i<5){
            System.out.println("enter project name");
            String name = sc.next();
            System.out.println("");
        }
    }
}
