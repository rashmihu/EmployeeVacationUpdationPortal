package com.labcorp.javaexample.View;

import com.labcorp.javaexample.model.Employee;
import com.labcorp.javaexample.model.HourlyEmployee;
import com.labcorp.javaexample.model.Manager;
import com.labcorp.javaexample.model.SalariedEmployee;


import java.util.ArrayList;
import java.util.List;


public class EmployeeList {

    List<HourlyEmployee> hourlyEmployeeList;
    List<SalariedEmployee> salariedEmployeeList;
    List<Manager> managerList;

    public EmployeeList(){
        this.hourlyEmployeeList=new ArrayList<>();
        this.salariedEmployeeList=new ArrayList<>();
        this.managerList= new ArrayList<>();
    }
    public EmployeeList(List<HourlyEmployee> hourlyEmployeeList, List<SalariedEmployee> salariedEmployeeList, List<Manager> managerList) {
        this.hourlyEmployeeList = hourlyEmployeeList;
        this.salariedEmployeeList = salariedEmployeeList;
        this.managerList = managerList;
    }

    public EmployeeList(List<HourlyEmployee> hourlyEmployeeList) {
        this.hourlyEmployeeList = hourlyEmployeeList;
    }


    public List<HourlyEmployee> getHourlyEmployeeList() {
        return hourlyEmployeeList;
    }

    public void setHourlyEmployeeList(List<HourlyEmployee> hourlyEmployeeList) {
        this.hourlyEmployeeList = hourlyEmployeeList;
    }

    public List<SalariedEmployee> getSalariedEmployeeList() {
        return salariedEmployeeList;
    }

    public void setSalariedEmployeeList(List<SalariedEmployee> salariedEmployeeList) {
        this.salariedEmployeeList = salariedEmployeeList;
    }

    public List<Manager> getManagerList() {
        return managerList;
    }

    public void setManagerList(List<Manager> managerList) {
        this.managerList = managerList;
    }
}
