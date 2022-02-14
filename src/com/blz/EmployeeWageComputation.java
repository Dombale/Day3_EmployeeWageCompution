package com.blz;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println(" Welcome in Employee Wage Computation....!!");

		int randomNum = (int) (Math.random() * 3); // create random number using math function
		int wagePerHour = 20;
		int empHrs = 0;
		int empHrsf = 8;
		int empHrsP = 4;
		switch (randomNum) {
		case 0:
			System.out.println(" Employee is Absent ");
			int salary = wagePerHour * empHrs; // Employee full Salary/Day
			System.out.println("Employee salary is :" + salary);
			break;
		case 1:
			System.out.println(" Employee is Present full time ");
			int salaryf = wagePerHour * empHrsf; // Employee full Salary/Day
			System.out.println("Employee salary is :" + salaryf);
			break;
		case 2:
			System.out.println(" Employee is Present part time ");
			int salaryp = wagePerHour * empHrsP; // Employee full Salary/Day
			System.out.println("Employee salary is :" + salaryp);
			break;
		}

	}
}