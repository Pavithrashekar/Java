
public class Players {
	String pname;
	int ttlruns;
	int nofcens;
	char category;
	
	

	public char getCategory() {
		return category;
	}

	public void setCategory(char category) {
		this.category = category;
	}

	public Players(String pname, int ttlruns, int nofcens, char category) {
		super();
		this.pname = pname;
		this.ttlruns = ttlruns;
		this.nofcens = nofcens;
		this.category = category;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getTtlruns() {
		return ttlruns;
	}

	public void setTtlruns(int ttlruns) {
		this.ttlruns = ttlruns;
	}

	public int getNofcens() {
		return nofcens;
	}

	public void setNofcens(int nofcens) {
		this.nofcens = nofcens;
	}
	
	public void display() {
		System.out.println("player name:"+pname+" "+"total runs:"+ttlruns+" "+"number of centuries:"+nofcens);
	}
	

}
