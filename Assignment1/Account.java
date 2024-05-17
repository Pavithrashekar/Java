import java.util.Scanner;
public class Account {

    int num;
    String name;
    double amount;
    double wthdrw;
    double dpst;
    float intst;

    public void readdata() {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter acc num:");
        num=sc.nextInt();
        System.out.println("Enter acc name:");
        name=sc.next();
        System.out.println("Enter amount:");
        amount=sc.nextDouble();

    }

    public void withdraw() {

        Scanner csc=new Scanner(System.in);
        System.out.println("Enter withdraw amount:");
        wthdrw=csc.nextDouble();
        System.out.println("Balance is:"+(amount-wthdrw));

    }

    public void deposit() {

        Scanner nsc=new Scanner(System.in);
        System.out.println("Enter amount to be deposited:");
        dpst=nsc.nextDouble();
        System.out.println("Balance is:"+(amount+dpst));

    }

    public void intrest() {

        Scanner ncsc=new Scanner(System.in);
        System.out.println("Enter intrest to be added:");
        intst=ncsc.nextFloat();
        System.out.println("Final is:"+(amount*intst));


    }


}
