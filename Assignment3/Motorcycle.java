
public class Motorcycle extends Vehicle {
	int engndisplcmt;
	int tspeed;
	
	public Motorcycle(int vid, String model, float ratepd, int engndisplcmt, int tspeed) {
		super(vid, model, ratepd);
		this.engndisplcmt = engndisplcmt;
		this.tspeed = tspeed;
	}
	
	public void display() {
		super.display();
		System.out.println("engndisplcmt:"+engndisplcmt+" "+"tspeed"+tspeed);
	}
	

}
