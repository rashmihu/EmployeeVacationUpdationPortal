package com.labcorp.javaexample;

import com.labcorp.javaexample.View.EmployeeList;
import com.labcorp.javaexample.model.Employee;
import com.labcorp.javaexample.model.HourlyEmployee;
import com.labcorp.javaexample.model.Manager;
import com.labcorp.javaexample.model.SalariedEmployee;
import org.springframework.beans.factory.support.ManagedList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JavaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaExampleApplication.class, args);
	}

}
