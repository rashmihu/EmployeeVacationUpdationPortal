package com.labcorp.javaexample.model;

public class Employee {
    public float totalWorkDays=260;
    private int empId;
    private String empName;
    private float curWorkDays;
    private float curVacationDays;
    private float maxVacationDays;

    public Employee(int empId, String empName, float maxVacationDays){
        this.empId=empId;
        this.empName=empName;
        this.maxVacationDays=maxVacationDays;
        this.curVacationDays =0;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public float getCurWorkDays() {
        return curWorkDays;
    }

    public void setCurWorkDays(float curWorkDays) {
        this.curWorkDays = curWorkDays;
    }

    public float getCurVacationDays() {
        return curVacationDays;
    }

    public void setCurVacationDays(float curVacationDays) {
        this.curVacationDays = curVacationDays;
    }

    public float getMaxVacationDays() {
        return maxVacationDays;
    }

    public void setMaxVacationDays(float maxVacationDays) {
        this.maxVacationDays = maxVacationDays;
    }

    public void work(float workingDays) {
        if(workingDays>=0 && workingDays<=totalWorkDays && this.getCurWorkDays()+workingDays<=totalWorkDays){
            float numOfVacationDays = (workingDays*this.getMaxVacationDays())/totalWorkDays;
            this.setCurVacationDays(numOfVacationDays);
        }
    }
    public void takeVacation(float vacationDays) {
        if(vacationDays<=this.getMaxVacationDays() && vacationDays <= this.getCurVacationDays() && this.getCurVacationDays() - vacationDays>0) {
            this.setCurVacationDays(this.getCurVacationDays() - vacationDays);
        }
    }


}
