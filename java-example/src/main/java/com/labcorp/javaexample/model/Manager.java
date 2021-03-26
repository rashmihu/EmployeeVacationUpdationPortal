package com.labcorp.javaexample.model;

public class Manager extends SalariedEmployee{

    public Manager(int empId,String empName) {
        super(empId,empName);
        super.setMaxVacationDays((float) 30);
    }
}
