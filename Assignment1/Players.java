import java.util.Scanner;
public class Players {

    String name;
    int age;
    String country;
    int ttlruns;

    public void readPlydata() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name=sc.next();
        System.out.println("Enter age:");
        age=sc.nextInt();
        System.out.println("Enter country:");
        country=sc.next();
        System.out.println("Enter total runs:");
        ttlruns=sc.nextInt();

    }

    public void displayPlydata() {

        if(ttlruns>5000) {
            System.out.println("Player name is:"+name);
            System.out.println("Player age is:"+age);
            System.out.println("Player country is:"+country);
            System.out.println("Player total runs are:"+ttlruns);
        }
        
    }
    
}
