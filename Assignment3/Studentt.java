import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
public class Studentt implements Serializable {
	int id;
	String name;
	int marks;
	public Studentt(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public void display() {
		System.out.println(id+" "+name+" "+marks);
	}
	
	public void findresult() {
		if(marks>60) {
			System.out.println("Enjoyy!!");
		}
		else {
			System.out.println("Better luck!!");
		}
	}
	
	public static void sortbymarks(ArrayList al) {
		Sortbymarks s= new Sortbymarks();
		Collections.sort(al,s);
		System.out.println("Sorting done!!");
	}
	
	

}
