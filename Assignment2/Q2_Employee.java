package Inheritance;

import java.util.Scanner;

public class Q2_Employee {
	public static void main(String[] args) {
		HourlyEmployee e1=new HourlyEmployee(1001, "raman", "lal", 60, 250);
		SalariedEmployee e2= new SalariedEmployee(1002, "ramesh", "yadav", 10, 50000, 12);
		e1.computeGrossPay();
		e1.computeNetPay();
		e2.computeGrossPay();
		e2.computeNetPay();
	}

}

class employee{
	Scanner s= new Scanner(System.in);
	int ssn;
	String fname;
	String Lname;
	float gross;
	float net;
	public employee( int ssn, String fname, String lname) {
		
		this.ssn = ssn;
		this.fname = fname;
		Lname = lname;
		
	}
	
	void display() {
		System.out.println(ssn+" "+fname+" "+Lname);
	}
}





class HourlyEmployee extends employee{
	int hours;
	float rate;
	
	public HourlyEmployee(int ssn, String fname, String lname, int hours, float rate) 
	{
		super(ssn, fname, lname);
		this.hours= hours;
		this.rate= rate;
	}
	
	public void computeGrossPay() {
		super.display();
		gross= hours*rate;
		System.out.println("Gross pay: "+gross);
	}
	
	public void computeNetPay() {
		
		if(hours>0 && hours <=200) {
			float bonus=gross*0.05f;
			System.out.println("bonus: "+bonus);
			float transExp=gross*0.065f;
			System.out.println("transport Expense: "+transExp);
			gross=gross+bonus+transExp;
			
		}else
		if(hours>200 && hours <=500) {
			float bonus=gross*0.065f;
			System.out.println("bonus: "+bonus);
			float transExp=gross*0.08f;
			System.out.println("transport Expense: "+transExp);
			gross=gross+bonus+transExp;
			
			
		}else
		if(hours>500 && hours <1000) {
			float bonus=gross*0.08f;
			System.out.println("bonus: "+bonus);
			float transExp=gross*0.10f;
			System.out.println("transport Expense: "+transExp);
			gross=gross+bonus+transExp;
			
		}
		if(gross<20000) 
		{
		float tax= gross*0.02f;
		System.out.println("tax: "+tax);
		net=gross-tax;
		}else {
			float tax= gross*0.05f;
			net=gross-tax;
			System.out.println("tax: "+tax);
		}
		System.out.println("Net pay: "+net);	
	}
}


class SalariedEmployee extends employee{
	int months;
	float salary;
	int experience;
	
	public SalariedEmployee(int ssn, String fname, String lname, int months, float salary, int experience) 
	{
		super(ssn, fname, lname);
		this.months= months;
		this.salary= salary;
		this.experience=experience;
	}
	public void computeGrossPay() {
		super.display();
		gross= months*salary;
		System.out.println("Gross pay: "+gross);
	}
	public void computeNetPay() {
		
		if(experience>0 && experience<=5) {
			float bonus=gross*0.05f;
			System.out.println("bonus: "+bonus);
			float transExp=gross*0.065f;
			System.out.println("transport Expense: "+transExp);
			gross=gross+bonus+transExp;
			
		}else
		if(experience>5 && experience<=10) {
			float bonus=gross*0.065f;
			System.out.println("bonus: "+bonus);
			float transExp=gross*0.08f;
			System.out.println("transport Expense: "+transExp);
			gross=gross+bonus+transExp;
			
			
		}else
		if(experience>10) {
			float bonus=gross*0.08f;
			System.out.println("bonus: "+bonus);
			float transExp=gross*0.10f;
			System.out.println("transport Expense: "+transExp);
			gross=gross+bonus+transExp;
			
		}
		if(gross<500000) 
		{
		float tax= gross*0.02f;
		System.out.println("tax: "+tax);
		net=gross-tax;
		}else {
			float tax= gross*0.05f;
			net=gross-tax;
			System.out.println("tax: "+tax);
		}
		System.out.println("Net pay: "+net);	
	}
}
	




