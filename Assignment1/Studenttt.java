package Classes_and_Objects;

import java.util.Scanner;

public class Q3_Student {
	
	public static void main( String[] args){
		Student s1=new Student();
		s1.stuInfo();
		s1.displayStd();
		s1.result();
		Student s2=new Student();
		s2.stuInfo();
		s2.displayStd();
		s2.result();
		Student s3=new Student();
		s3.stuInfo();
		s3.displayStd();
		s3.result();
	
		
	}

}

class Student {
	int sid;
	String sname;
	float mark;
	
	public void stuInfo() {
		Scanner s= new Scanner(System.in);
		System.out.print("enter student id: ");
		sid=s.nextInt();
		System.out.print("enter student name: ");
		sname=s.next();
		System.out.print("enter marks: ");
		mark=s.nextFloat();
		
	}
	public void displayStd() {
		System.out.print(sid+" "+sname+" "+mark+" ");
	}
	
	public void result() 
	{
		if(mark>=33) {
			if(mark>=90) {
				System.out.print("pass A+");
			}else if(mark>=75 && mark<90) {
				System.out.print("pass A");
			}else if(mark>=60 && mark<75) {
				System.out.print("pass B");
			}else if(mark>=45 && mark<60) {
				System.out.print("pass C");
			}else if(mark>=33 && mark<45) {
				System.out.print("pass D");
			}
			
		}else 
		{
			System.out.println("fail");
		}
		System.out.println("   ");
	}
	
}
