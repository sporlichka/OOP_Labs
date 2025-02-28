package com.example.domain;

import java.util.Arrays;

public class Manager extends Employee{
    private String deptName;
    private Employee[] staff;
    private int employeeCount = 0;

    public Manager(int empId, String name, String ssn, double salary, String deptName, Employee[] staff){
        super(empId, name, ssn, salary);
        this.deptName = deptName;
        this.staff = new Employee[20];
        this.staff = staff;
    }

    public String getDeptName(){
        return deptName;
    }

    public int findEmployee(Employee find){
        for(int i = 0; i < staff.length; i++){
            if(find == staff[i])
                return i;
        }
        return -1;
    }

    public boolean addEmployee(Employee emp){
        if(findEmployee(emp) != -1)
            return false;
        else{
            staff[employeeCount] = emp;
            employeeCount++;
            return true;
        }
    }

    public boolean removeEmployee(Employee emp){
        boolean status = false;
        Employee[] temp = staff;
        int empCounter = 0;
        for(int i = 0; i < staff.length; i++){
            if(emp.getEmpId()==staff[i].getEmpId()){
                status = true;
                continue;
            }
            else{
                temp[i] = staff[i];
                empCounter++;
            }
        }
        if(status){
            staff = temp;
            employeeCount = empCounter;
        }
        return status;
    }

    public void printStaffDetails(Manager man){
        System.out.println();
        System.out.println("Employee id:            " + man.getEmpId());
        System.out.println("Employee name:          " + man.getName());
        System.out.println("Employee Soc Sec #:     " + man.getSsn());
        System.out.println("Employee salary:        " + man.getSalary());
        System.out.println("Employee department     " + man.getDeptName());
        System.out.println("Employee staff array:   " + Arrays.toString(man.staff));
    }

    @Override
    public String toString(){
        return super.toString() + "\nDepartment:     " + getDeptName();
    }
}
