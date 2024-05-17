import java.util.Scanner;
public class Stud {
		int id;
		String name;
		int marks;
		String result;
		Scanner sc=new Scanner(System.in);
		public int getId() {
			return id;
		}

		public void setId(int id) {
			System.out.println("Enter id:");
			id=sc.nextInt();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			System.out.println("Enter name:");
			name=sc.next();
		}

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			System.out.println("Enter marks:");
			marks=sc.nextInt();
		}

		public String getResult() {
			return result;
		}

		public void setResult(String result) {
			System.out.println("Enter p or f:");
			result=sc.next();
		}

		public void displayy() {
			
			System.out.println(id+" "+name+" "+marks+" "+result);
		}

}
