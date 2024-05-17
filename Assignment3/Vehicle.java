
public class Vehicle {
	int vid;
	String model;
	float ratepd;
	public Vehicle(int vid, String model, float ratepd) {
		super();
		this.vid = vid;
		this.model = model;
		this.ratepd = ratepd;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public float getRatepd() {
		return ratepd;
	}
	public void setRatepd(float ratepd) {
		this.ratepd = ratepd;
	}
	
	public void display() {
		System.out.println("vid:"+vid+" "+"model:"+model+" "+"ratepd:"+ratepd);
	}

}
