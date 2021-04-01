/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.adpgroupassementproject;

/**
 *
 * @author 219156026
 * /checks the number of employee inside the company
 */
public class Employee {
    private String employee_name;

    
    
    private double salary;

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public static String message(){
    
    return "list of employee";
    }
    public double raiseAmount(){ 
    
    double amount = 10.6;
    return (this.salary*amount);
    } 
    @Override
    public String toString() {
        return "Employee{" + "employee_name=" + employee_name + ", salary=" + salary + '}';
    }
    
}
