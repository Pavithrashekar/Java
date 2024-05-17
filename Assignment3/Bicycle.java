
public class Bicycle extends Vehicle {
	int framesize;
	String geartype;
	
	public Bicycle(int vid, String model, float ratepd, int framesize, String geartype) {
		super(vid, model, ratepd);
		this.framesize = framesize;
		this.geartype = geartype;
	}
	
	public void display() {
		super.display();
		System.out.println("framesize:"+framesize+" "+"geartype:"+geartype);
	}
	

}
