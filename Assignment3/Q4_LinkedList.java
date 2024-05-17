/*
 * 
 * 
 * 
 */

package Collection;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Q4_LinkedList {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	LinkedList<Integer> lt=new LinkedList<>();
	lt.add(10);
	lt.add(20);
	lt.add(30);
	lt.add(40);
	lt.add(50);
	lt.add(60);
	lt.add(70);
	lt.add(80);
	lt.add(90);
	lt.add(100);
	System.out.println(" ");
	System.out.println(lt);
	System.out.println();
	
	
	
	
	
	System.out.println("reverse the list");
	int a=lt.size()-1;
	for(int i=a; i>=0; i--)
	{	System.out.println(" "+lt.get(i));
	}
	System.out.println();
	
	
	//insert at given position
	System.out.println("Enter the index(0-9) and value");
	  a=sc.nextInt();
	int b=sc.nextInt();
	lt.set(a, b);
	System.out.println(lt);
	System.out.println();
	
	
	
	// delete at the beginning
	System.out.println("delete initial position:");
	lt.remove();
	System.out.println(lt);
	System.out.println();
	
	
	// delete given position
	System.out.println("Enter the position to delete:");
	a=sc.nextInt();
	lt.remove(a);
	System.out.println(lt);
	System.out.println();
	
	System.out.println("insert the value after given node");
	System.out.print("enter the node:");
    a=sc.nextInt();
    System.out.println("enter the value:");
    b=sc.nextInt();
	a=a+1;
	lt.add(a, b);
	System.out.println(lt);
	System.out.println();
	
	System.out.println("delete the value after given node");
	System.out.print("enter the node:");
    a=sc.nextInt();
	a=a+1;
	lt.remove(a);
	System.out.println(lt);
	System.out.println();
	
	
	
	
	
	}

}


