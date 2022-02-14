package com.blz;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println(" Welcome in Employee Wage Computation....!!");

		int randomNum = (int) (Math.random() * 2); // create random number using math function
		int wagePerHour = 20;
		int empHrs = 0;
		int empHrsf = 8;

		if (randomNum == 1) // Check Employee presence
		{
			System.out.println(" Employee is Present ");
			int salary = wagePerHour * empHrsf; // Employee Full timeSalary/Day
			System.out.println("Employee salary of Full time is :" + salary);
		} else {
			System.out.println(" Employee is Absent ");
			int salary = wagePerHour * empHrs; // No Working , No Salary
			System.out.println("Employee salary is :" + salary);
		}
	}

}
