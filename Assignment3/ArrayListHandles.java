import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListHandles {
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList();
		al.add(50);
		al.add(90);
		al.add(60);
		al.add(20);
		al.add(70);
		al.add(30);
		al.add(40);
		System.out.println("displaying elements:");
		for(int obj:al) {
			System.out.println(obj);
		}
		System.out.println("removing element:");
		al.remove(2);
		for(int obj:al) {
			System.out.println(obj);
		}
		System.out.println("updating element:");
		al.set(3,100);
		for(int obj:al) {
			System.out.println(obj);
		}
		System.out.println("using iterator:");
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("the element in the position of 40 is:"+al.indexOf(40));
		
		Collections.sort(al);
		System.out.println("after sorting:");
		for(int obj:al) {
			System.out.println(obj);
		}
		
		
		
	}

}
