package Collection;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Q3_StackTest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Stack<Integer> st=new Stack<>();
	st.add(10);
	st.add(20);
	st.add(30);
	st.add(40);
	st.add(50);
	st.add(60);
	st.add(70);
	st.add(80);
	st.add(90);
	System.out.println(st);
	System.out.println();
	
	System.out.println("adding value by push");
	Integer a=sc.nextInt();
	st.push(a);
	System.out.println(st);
	System.out.println();
	
	System.out.println("replace the value(index, value)");
     int b=sc.nextInt();
     a=sc.nextInt();
     st.set(b, a);
    System.out.println(st);
 	System.out.println();
 	
 	
 	
 	System.out.println("remove the value");
 	b=sc.nextInt();
 	st.remove(b);
 	System.out.println(st);
 	System.out.println();

	
	System.out.println("getting value from Stack by pop");
	Iterator<Integer> t=st.iterator();{
		while(t.hasNext()) 
		{
	       Integer e=st.pop();
	       System.out.println(e);}}
	
	
	
	
	
	
}
}
