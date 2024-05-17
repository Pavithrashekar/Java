import java.util.ArrayList;
import java.util.Scanner;
public class StudMnage {
	public ArrayList<Stud> createStudList() {
		ArrayList <Stud> sm=new ArrayList<>();
		Stud s1= new Stud();
		Stud s2= new Stud();
		Stud s3= new Stud();
		sm.add(s1);
		sm.add(s2);
		sm.add(s3);
		return sm;
	}
	public void removestud(ArrayList <Stud> sm) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to be deleted:");
		a=sc.nextInt();
		int pos =0;
		for(Stud  obj      :sm)
		{
			if(obj.id ==a)
			{
				 pos = sm.indexOf(obj);
			}
			sm.remove(pos);		
		}
		
	}
	
	public static void main(String[] args) {
		
	}

}
