
public class Car extends Vehicle {
	int nofseats;
	String fueltype;
	
	public Car(int vid, String model, float ratepd, int nofseats, String fueltype) {
		super(vid, model, ratepd);
		this.nofseats = nofseats;
		this.fueltype = fueltype;
	}
	
	public void display() {
		super.display();
		System.out.println("nofseats:"+nofseats+" "+"fueltype:"+fueltype);
	}
	

}
