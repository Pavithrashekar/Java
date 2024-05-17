package com.Q5;

import java.util.*;

public class Company_Q5 {
	public static void main(String[] args) {		
		
		Payroll pr = new Payroll();
		pr.objEmp();
		System.out.println();
		pr.objCom();
		System.out.println();
		pr.objSal();
		System.out.println();
		pr.objHour();
	}
}


class Commission_Emp extends Employee {
	double sales;
	double commission;
	double salary = 0;
	
	public Commission_Emp(int sSN, String name, double sales, double commission, String type) {
		super(sSN, name, type);
		super.disp_emp();
		
		this.sales = sales;
		this.commission = commission;
	}
	
	void salary() {
		super.salary();
		super.emp_type();
		if(commission > 10 && sales>10) {
			salary = (commission*15) + (sales*5);
		} else {
			salary = (commission*10) + (sales*2);
		}
		System.out.println("The salary of " + name + " is = " + salary);
	}
	
}


class Employee {
	int sSN;
	String name;
	String type;

	public Employee(int sSN, String name, String type) {	
		this.sSN = sSN;
		this.name = name;
		this.type = type;
	}

	void disp_emp() {
		System.out.println("ID = " + sSN);
		System.out.println("Name = " + name);
	}

	void emp_type() {
		if(type.equals("Commission")) {
			System.out.println("Employed On Commission Basis.");
		} else if(type.equals("Salaried")) {
			System.out.println("Employed On Salary Basis.");
		} else {
			System.out.println("Employed On Hourly Basis.");
		}
	}
	
	void salary() {
		System.out.println("Employee gets a salary on monthly basis.");
		System.out.println("No matter what type of employee they are !!!");
	}

}

class Hourly_emp extends Employee {
	int hours;
	double wage;
	
	public Hourly_emp(int sSN, String name, String type, int hours, double wage) {
		super(sSN, name, type);
		super.disp_emp();
		
		this.hours = hours;
		this.wage = wage;
	}
	
	void salary() {
		super.salary();
		super.emp_type();
		double salary = 0;
		if(hours > 100 && wage >50) {
			salary = (hours*20) + (wage * hours);
		} else {
			salary = (hours*10) + (wage * hours);
		}
		
		System.out.println("The salary of hourly employee " + name+ " is = " + salary);
	}
	
}

class Salaried_emp extends Employee {
	
	double basic_salary;
	int exp;

	public Salaried_emp(int sSN, String name, String type, double basic_salary, int exp) {
		super(sSN, name, type);
		super.disp_emp();
		
		this.basic_salary = basic_salary;
		this.exp = exp;
	}
	
	void salary() {
		super.salary();
		super.emp_type();
		double incentive = 0;
		if(exp>10) {
			incentive = basic_salary;
		} else if(exp>5 && exp<=10) {
			incentive = basic_salary * 0.1;
		} else {
			incentive = basic_salary * 0.05;
		}
		double tot = incentive + basic_salary;
		System.out.println("The incentives of " + name + " is = " + incentive);
		System.out.println("The salary of " +name + " is = " + tot);
	}
	
}

class Payroll {
	Scanner sc = new Scanner(System.in);
	
	void objEmp() {
		System.out.println("Enter the no of employees");
		int n = sc.nextInt();
		Employee[] em = new Employee[n];
		for(int i = 0; i<n; i++) {
			em[i] = new Employee(sc.nextInt(), sc.next(), sc.next());
		}
		for(int i = 0; i<n; i++) {
			em[i].disp_emp();
			em[i].emp_type();
		}
	}
	
	void objCom() {
		System.out.println("Enter the no of Commissioned Employees");
		int n = sc.nextInt();
		Commission_Emp[] c_emp = new Commission_Emp[n];
		for(int i = 0; i<n; i++) {
			c_emp[i] = new Commission_Emp(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.next());
		}
		for(int i = 0; i<n; i++) {
			c_emp[i].salary();
		}
	}
	
	void objSal() {
		System.out.println("Enter the no of Salaried Employees");
		int n = sc.nextInt();
		Salaried_emp[] s_emp = new Salaried_emp[n];
		for(int i = 0; i<n; i++) {
			s_emp[i] = new Salaried_emp(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextInt());
		}
		for(int i = 0; i<n; i++) {
			s_emp[i].salary();
		}
	}
	
	void objHour() {
		System.out.println("Enter the no of Hourly Employees");
		int n = sc.nextInt();
		Hourly_emp[] h_emp = new Hourly_emp[n];
		for(int i = 0; i<n; i++) {
			h_emp[i] = new Hourly_emp(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
		}
		for(int i = 0; i<n; i++) {
			h_emp[i].salary();
		}
	}
	
}
