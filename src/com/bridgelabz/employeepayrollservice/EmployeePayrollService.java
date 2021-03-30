package com.bridgelabz.employeepayrollservice;

import java.util.LinkedList;
import java.util.Scanner;

public class EmployeePayrollService {

    public static  LinkedList<EmployeePayroll> employeePayrollsData = new LinkedList<>();

    public static void readEmpPayrollData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Id");
        int empId = scanner.nextInt();
        System.out.println("Enter Employee Name");
        String empName = scanner.next();
        System.out.println("Enter Employee Salary");
        int empSalary = scanner.nextInt();
        EmployeePayroll employeePayroll = new EmployeePayroll(empId, empName, empSalary);
        employeePayrollsData.add(employeePayroll);
    }

    public static void writeEmpPayrollData() {
        System.out.println(employeePayrollsData);
    }
    public static void main (String [] args){
        readEmpPayrollData();
        writeEmpPayrollData();
    }
}
