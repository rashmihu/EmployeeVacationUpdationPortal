package com.labcorp.javaexample.controller;

import com.labcorp.javaexample.View.EmployeeList;
import com.labcorp.javaexample.model.SaveWorkDayModel;
import com.labcorp.javaexample.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Controller
public class AppController {
    private static EmployeeList employeeList = new EmployeeList() ;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        return "redirect:/index";
    }

    static {
        SalariedEmployee s1= new SalariedEmployee(101,"Thor");
        SalariedEmployee s2= new SalariedEmployee(102,"Odin");
        SalariedEmployee s3= new SalariedEmployee(103,"Shakitman");
        SalariedEmployee s4= new SalariedEmployee(104,"captain America");
        SalariedEmployee s5= new SalariedEmployee(105,"flash");
        SalariedEmployee s6= new SalariedEmployee(106,"Wolverine");
        SalariedEmployee s7= new SalariedEmployee(107,"Black Panther");
        SalariedEmployee s8= new SalariedEmployee(108,"Wonder Woman");
        SalariedEmployee s9= new SalariedEmployee(109,"Daredevil");
        SalariedEmployee s10= new SalariedEmployee(110,"Storm");
        HourlyEmployee h1 = new HourlyEmployee(111,"Batman");
        HourlyEmployee h2 = new HourlyEmployee(112,"Superman");
        HourlyEmployee h3 = new HourlyEmployee(113,"Nick Fury");
        HourlyEmployee h4 = new HourlyEmployee(114,"Hulk");
        HourlyEmployee h5 = new HourlyEmployee(115,"Doctor Strange");
        HourlyEmployee h6 = new HourlyEmployee(116,"Professor X");
        HourlyEmployee h7 = new HourlyEmployee(117,"Thing");
        HourlyEmployee h8 = new HourlyEmployee(118,"Luke Cage");
        HourlyEmployee h9 = new HourlyEmployee(119,"Hurricane");
        HourlyEmployee h10 = new HourlyEmployee(120,"Atom");
        Manager m1 = new Manager(121,"Ironman");
        Manager m2 = new Manager(122,"Ant-Man");
        Manager m3 = new Manager(123,"Aquaman");
        Manager m4 = new Manager(124,"Catwoman");
        Manager m5 = new Manager(125,"Daredevil");
        Manager m6 = new Manager(126,"Ghost Rider");
        Manager m7 = new Manager(127,"Iron Fist");
        Manager m8 = new Manager(128,"Wonder Woman");
        Manager m9 = new Manager(129,"X-Men");
        Manager m10 = new Manager(130,"Robin");


        List<SalariedEmployee> salariedEmployeeList = new ArrayList<>();
        salariedEmployeeList.add(s1);
        salariedEmployeeList.add(s2);
        salariedEmployeeList.add(s4);
        salariedEmployeeList.add(s5);
        salariedEmployeeList.add(s6);
        salariedEmployeeList.add(s7);
        salariedEmployeeList.add(s8);
        salariedEmployeeList.add(s9);
        salariedEmployeeList.add(s10);


        List<HourlyEmployee> hourlyEmployeeList = new ArrayList<>();
        hourlyEmployeeList.add(h1);
        hourlyEmployeeList.add(h2);
        hourlyEmployeeList.add(h3);
        hourlyEmployeeList.add(h4);
        hourlyEmployeeList.add(h5);
        hourlyEmployeeList.add(h6);
        hourlyEmployeeList.add(h7);
        hourlyEmployeeList.add(h8);
        hourlyEmployeeList.add(h9);
        hourlyEmployeeList.add(h10);

        List<Manager> managerList = new ArrayList<>();
        managerList.add(m1);
        managerList.add(m2);
        managerList.add(m3);
        managerList.add(m4);
        managerList.add(m5);
        managerList.add(m6);
        managerList.add(m7);
        managerList.add(m8);
        managerList.add(m9);

        employeeList.setHourlyEmployeeList(hourlyEmployeeList);
        employeeList.setSalariedEmployeeList(salariedEmployeeList);
        employeeList.setManagerList(managerList);
    }

    @GetMapping("/index")
    public String load(Model model){
        model.addAttribute("hourlyEmployeeList",employeeList.getHourlyEmployeeList());
        model.addAttribute("salariedEmployeeList",employeeList.getSalariedEmployeeList());
        model.addAttribute("managersList",employeeList.getManagerList());

        return "index";
    }

    @RequestMapping(value = "/updateWorkDays", method = RequestMethod.POST)
    public String updateWorkDays(Model model,@ModelAttribute("EmployeeModel") SaveWorkDayModel saveWorkDayModel) {
        System.out.println();
            if(saveWorkDayModel.getEmpType().equals("Hourly")){
                for(HourlyEmployee hourlyEmployee:employeeList.getHourlyEmployeeList()){
                    if(hourlyEmployee.getEmpId()== saveWorkDayModel.getEmpId()){
                        hourlyEmployee.work(saveWorkDayModel.getWorkDays());
                    }
                }
            }else if(saveWorkDayModel.getEmpType().equals("Salaried")){
                for(SalariedEmployee salariedEmployee:employeeList.getSalariedEmployeeList()){
                    if(salariedEmployee.getEmpId()== saveWorkDayModel.getEmpId()){
                        salariedEmployee.work(saveWorkDayModel.getWorkDays());
                    }
                }
            }else{
                for(Manager manager:employeeList.getManagerList()){
                    if(manager.getEmpId()== saveWorkDayModel.getEmpId()){
                        manager.work(saveWorkDayModel.getWorkDays());
                    }
                }
            }
        return "redirect:/index";
    }

    @RequestMapping(value = "/updateVacationDays", method = RequestMethod.POST)
    public String updateVacationDays(Model model, @ModelAttribute("UpdateVacationDaysModel") UpdateVacationDaysModel updateVacationDaysModel) {
        if(updateVacationDaysModel.getEmpType().equals("Hourly")){

            for(HourlyEmployee hourlyEmployee:employeeList.getHourlyEmployeeList()){
                if(hourlyEmployee.getEmpId()== updateVacationDaysModel.getEmpId()){
                    hourlyEmployee.takeVacation(updateVacationDaysModel.getVacationDays());
                }
            }
        }else if(updateVacationDaysModel.getEmpType().equals("Salaried")){
            for(SalariedEmployee salariedEmployee:employeeList.getSalariedEmployeeList()){
                if(salariedEmployee.getEmpId()== updateVacationDaysModel.getEmpId()){
                    salariedEmployee.takeVacation(updateVacationDaysModel.getVacationDays());
                }
            }
        }else{
            for(Manager manager:employeeList.getManagerList()){
                if(manager.getEmpId()== updateVacationDaysModel.getEmpId()){
                    manager.takeVacation(updateVacationDaysModel.getVacationDays());
                }
            }
        }
        return "redirect:/index";
    }
}
