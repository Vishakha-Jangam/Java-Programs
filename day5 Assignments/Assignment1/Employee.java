package com.Assignment1;
import java.util.Scanner;

public class Employee {
	private static Scanner scanner = new Scanner(System.in);
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void calculateNetSalary(double per) {
		double pfAmount = salary * (per / 100);
        double netSalary = salary - pfAmount;
        this.setNetSalary(netSalary);
	}
	public static  Employee getEmployeeDetails() {
		Employee employee = new Employee();
		System.out.println("Enter Id: ");
		employee.setEmployeeId(scanner.nextInt());
        System.out.println("Enter Name: ");
        employee.setEmployeeName(scanner.next());
        System.out.println("Enter salary: ");
        employee.setSalary(scanner.nextDouble());
       
        return employee;	
	}
	public static int getPFPercentage(int percent) {
		return percent;
		
	}
}
