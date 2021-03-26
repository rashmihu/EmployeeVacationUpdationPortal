package com.labcorp.javaexample.model;

public class SaveWorkDayModel {
    private int empId;
    private String empType;
    private float workDays;

    public SaveWorkDayModel(int empId, String empType, float workDays) {
        this.empId = empId;
        this.empType = empType;
        this.workDays = workDays;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public float getWorkDays() {
        return workDays;
    }

    public void setWorkDays(float workDays) {
        this.workDays = workDays;
    }
}
