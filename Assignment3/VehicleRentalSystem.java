import java.util.Scanner;
public class VehicleRentalSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome you idiot!!");
		Vehicle Car= new Car(1,"Kia",9000,3,"petrol");
		Vehicle Motorcycle = new Motorcycle(2,"Honda",6000,4500,100);
		Vehicle Bicycle = new Bicycle(3,"tvs",4000,34,"8speed");
		
		System.out.println("the available vehicles:");
		Car.display();
		Motorcycle.display();
		Bicycle.display();
		
		System.out.println("Select vehicle id:");
		int choice=sc.nextInt();
		System.out.println("enter duration:");
		int rate=sc.nextInt();
		Vehicle select;
		
		switch(choice) {
		case 1: select=Car;
		break;
		case 2: select=Motorcycle;
		break;
		case 3: select=Bicycle;
		break;
		default:
			System.out.println("enter valid num stupid!!");
			return;
		}
		
		double rentalcost=rate*select.ratepd;
		System.out.println("your bill is");
		select.display();
		System.out.println("duration is:"+rate+"cost is"+rentalcost);
	}

}
