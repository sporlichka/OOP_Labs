package com.example;
import com.example.business.EmployeeStockPlan;
import com.example.domain.*;

public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Engineer eng = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        Manager mng = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing", null);
        Admin adm = new Admin(304, "Bill Monroe", "108-23-6509", 75_002.34);
        Director dir = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00, null);

        EmployeeStockPlan esp = new EmployeeStockPlan();
        printEmployee(eng, esp);
        printEmployee(mng, esp);
        printEmployee(dir, esp);

//        mng.setName("Barbara Johnson-Smythe");
//        mng.raiseSalary(10_000.00);
//        printEmployee(mng, esp);
    }

    public static void printEmployee(Employee emp){
        System.out.println();
        System.out.println("Employee type:  " + emp.getClass().getSimpleName());
        System.out.println(emp);
    }

    public static void printEmployee(Employee emp, EmployeeStockPlan esp){
        printEmployee(emp);
        System.out.println("Stock Options:  " + esp.grantStock(emp));
    }
}