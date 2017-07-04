package com.realdolmen.greeting.beans;

import com.realdolmen.greeting.domain.Employee;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 * Created by vdabcursist on 04/07/2017.
 */

@ManagedBean
@RequestScoped
public class EmployeeForm {

    private Employee employee;

    @ManagedProperty("#{employeeList}")
    private EmployeeList employeeList;



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

    public EmployeeList getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(EmployeeList employeeList) {
        this.employeeList = employeeList;
    }

    public String saveEmployee(){
        System.out.println(employee.toString());
        employeeList.addEmployee(employee);
        employee=new Employee();
        return "employeeList.xhtml?faces-redirect=true";


    }
}
