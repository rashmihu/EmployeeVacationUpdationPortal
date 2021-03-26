package com.labcorp.javaexample.model;

public class UpdateVacationDaysModel {
    private int empId;
    private String empType;
    private float vacationDays;

    public UpdateVacationDaysModel(int empId, String empType, float vacationDays) {
        this.empId = empId;
        this.empType = empType;
        this.vacationDays = vacationDays;
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

    public float getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(float vacationDays) {
        this.vacationDays = vacationDays;
    }
}
