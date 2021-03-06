package com.bridgelabz.employeepayrollservice;

public class EmployeePayroll {

    private final int id;
    private final String name;
    private final int salary;

    public EmployeePayroll(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeePayroll{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
