package com.realdolmen.greeting.beans;

import com.realdolmen.greeting.domain.Employee;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by vdabcursist on 04/07/2017.
 */

@ManagedBean
@RequestScoped
public class EmployeeForm {

    private Employee employee;


    @PostConstruct
    public void init() {
        employee = new Employee();
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String saveEmployee(){
        System.out.println(employee.toString());
        return null;

    }
}
