package com.blz;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println(" Welcome in Employee Wage Computation....!!");

		int randomNum = (int) (Math.random() * 3); // create random number using math function

		// Initialize and declare variables

		int wagePerHour = 20;
		int empHrs = 0;
		int empHrsf = 8;
		int empHrsP = 4;
		int workingDay = 20;
		// Use Switch case condition for calculating employee salary of part time and
		// full time for a month.
		switch (randomNum) {
		case 0:
			System.out.println(" Employee is Absent ");
			int salary = wagePerHour * empHrs; // Employee No Salary/Day
			System.out.println("Employee salary is :" + salary);
			break;
		case 1:
			System.out.println(" Employee is Present full time ");
			int salary1 = wagePerHour * empHrsf * workingDay; // Employee full Salary/Month
			System.out.println("Employee salary of Full time of Full Month is :" + salary1);
			break;
		case 2:
			System.out.println(" Employee is Present part time ");
			int salary11 = wagePerHour * empHrsP * workingDay; // Employee Part time Salary/Month
			System.out.println("Employee salary of part time of full month is :" + salary11);
			break;
		}

	}
}