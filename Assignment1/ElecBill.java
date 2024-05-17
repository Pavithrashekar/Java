import java.util.Scanner;
public class ElecBill {

    int custnum;
    String custname;
    int units;

    public void readdata() {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer num:");
        custnum=sc.nextInt();
        System.out.println("Enter customer name:");
        custname=sc.next();
        System.out.println("Enter units consumed:");
        units=sc.nextInt();
    }

    public void showdata() {

        System.out.println("Customer number:"+custnum);
        System.out.println("Customer name:"+custname);
        System.out.println("Customer units consumed:"+units);
    }

    public void computeBill() {

        double bill;
        if(units<=100) {
            System.out.println("Bill is:"+(100*1.20));
        }
        else if(units>100&&units<=200) {
            bill=(100*1.20)+((units-100)*2);
            System.out.println("Bill is:"+bill);
        }
        else if(units>200&&units<=300) {
            bill=(100*1.20)+((units-200)*2.00);
            System.out.println("Bill is:"+bill);
        }
        else if(units>300&&units<=600) {
            bill=(100*1.20)+(200*2.00)+((units-300)*3);
            System.out.println("Bill is:"+bill);
        }
        else {
            bill=(100*1.20)+(200*2.00)+(300*3.00)+((units-600)*5);
            System.out.println("Bill is:"+bill);
        }
    }


    
}
