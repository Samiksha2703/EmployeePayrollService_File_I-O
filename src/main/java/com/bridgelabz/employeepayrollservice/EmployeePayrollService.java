package com.bridgelabz.employeepayrollservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

    private static List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.writeEmployeePayrollData(consoleInputReader);
        employeePayrollService.readEmployeePayrollData();
    }

    private void writeEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee ID : ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee Name : ");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee Salary : ");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }

    private void readEmployeePayrollData() {
        System.out.println("\nWritin Employee Payroll Roaster to Console\n" + employeePayrollList);
    }

}
