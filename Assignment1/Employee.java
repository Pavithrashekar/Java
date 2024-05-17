import java.util.Scanner;
public class Employee {

    int empnum;
    String empname;
    String desgntn;
    String dept;
    double sal;

    public void readEmpdata() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter empnum:");
        empnum=sc.nextInt();
        System.out.println("Enter empname:");
        empname=sc.next();
        System.out.println("Enter designation:");
        desgntn=sc.next();
        System.out.println("Enter dept:");
        dept=sc.next();
        System.out.println("Enter salary:");
        sal=sc.nextInt();
    }

    public void displayEmpdata() {

        System.out.println("Empnum is:"+empnum);
        System.out.println("Empname is:"+empname);
        System.out.println("Emp designation is:"+desgntn);
        System.out.println("Empdept is:"+dept);
        System.out.println("Empsalary is:"+sal);
    }

    public static void main(String[] args) {
        
        Employee emp = new Employee();
        emp.readEmpdata();
        emp.displayEmpdata();
    }
    
}
