package Inheritance;

public class Q3_Profession {
	public static void main(String[] args) {
		teacher e1= new teacher("M S Sumanam", 45, "mathematics", 12);
		e1.displayTeach();
		PermanentEmployee e2=new PermanentEmployee("seeta", 32, "technical", "developer", 45000, 9);
		e2.displayPE();
		ContractEmployee e3=new ContractEmployee("Ramesh", 43, "construction  ", "senior engineer", 80000, 5);
	    e3.displayCE();
	    
	}

}

class person{
	String name;
	int age;
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void display() {
		System.out.print(name+" "+age+" ");
	}	
}

class teacher extends person{
	String subject;
	int experience;
	float salary;
	
	public teacher(String name, int age, String subject, int experience) {
		super(name, age);
		 this.experience=experience;
		 this.subject=subject; 
	}
	 public void displayTeach() {
		 System.out.println("TEACHER");
		 super.display();
		 System.out.println(subject+" "+experience);
		 if(experience>=0 && experience<10 ) {
			 salary=50000*experience*0.1f;
		 }else
		 if(experience>=10 && experience<15 ) {
			 salary=50000*experience*0.2f;
		 }else if(experience>15 && experience<20 ) {
			 salary=50000*experience*0.25f;
		 }else
		 {
			 salary=50000*experience*0.35f;
		 }
		 System.out.println("salary :"+salary);
		 System.out.println("-----------------");
		 
	 }
	
}

class profession extends person{
	String dept;
	String designation;
	public profession(String name, int age, String dept, String designation) 
	{
		super(name, age);
		this.dept=dept;
		this.designation=designation;
	}
   
	public void displayProf() {
		super.display();
		System.out.println(dept+" "+designation);
	}
}

class PermanentEmployee extends profession{
	   float salary ;
	   int companyPeriod;
	   

	public PermanentEmployee(String name, int age, String dept, String designation, float salary, int companyPeriod) {
		super(name, age, dept, designation);
		this.salary= salary;
		this.companyPeriod=companyPeriod;
		
	}
	
	public void displayPE() {
		System.out.println("PERMANENT EMPLOYEE");
		super.displayProf();
		float healthBenefit;
		float Pf;
		float transExpenses;
		if(companyPeriod<=5) {
			 healthBenefit= salary*0.05f;
			 transExpenses=salary*0.08f;
			 Pf=salary*0.08f;
		}else
			if(companyPeriod<=8 && companyPeriod>5) {
			healthBenefit= salary*0.065f;
			transExpenses=salary*0.085f;
			Pf=salary*0.07f;
			} else
			if(companyPeriod<=12 && companyPeriod>8) {
				healthBenefit= salary*0.07f;
				transExpenses=salary*0.09f;
				Pf=salary*0.06f;
			} else 
			  {
			 healthBenefit= salary*0.075f;
			 transExpenses=salary*0.1f;
			 Pf=salary*0.05f;
		     }
		
		salary= salary+healthBenefit+transExpenses-Pf;
		System.out.println("health Benefit: "+healthBenefit);
		System.out.println("transport Expenses: "+transExpenses);
		System.out.println("Provident fund: "+Pf);
		System.out.println("Salary: "+salary);
		System.out.println("----------------------------------------");
	}
}

class ContractEmployee extends profession{
	   float fees ;
	   int period;
	   float payable;

	public ContractEmployee(String name, int age, String dept, String designation, float fees, int period) {
		super(name, age, dept, designation);
		this.fees= fees;
		this.period=period;
	}
	public void displayCE() {
		System.out.println("CONTRACT EMPLOYEE");
		super.displayProf();
		float transExpenses=(fees*period)*0.2f;
		payable=(fees*period)+transExpenses;
		System.out.println("transport Expenses: "+transExpenses);
		System.out.println("payable amount: "+payable);
	}
}











