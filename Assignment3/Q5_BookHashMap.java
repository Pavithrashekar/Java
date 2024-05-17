package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q5_BookHashMap {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashMap<Integer,book> w=new HashMap<>();
		book b1=new book("water", 500, "shubham", 1050, "hill");
		book b2=new book("flower", 400, "robert", 1450, "ocean");
		book b3=new book("adventure", 300, "steve", 1780, "oak tree");
		book b4=new book("false beauty", 350, "reene", 16240, "maple");
		book b5=new book("fire heart", 450, "Zia", 1840, "hill");
		w.put(101, b1);
		w.put(102, b2);
		w.put(103, b3);
		w.put(104, b4);
		w.put(105, b5);
	    w.put(106, new book("fresh start",600,"ravishanke",1542,"hill"));
	    w.put(107, new book("root",150,"mrithi",73012,"bengol"));
	    
	    
	    System.out.println("using 'for' to retrieve each value:");
	    for(Map.Entry<Integer, book> mp : w.entrySet())
	    {
	    	System.out.print(mp.getKey()+" ");
	    	mp.getValue().dispBook();
	    }
	    System.out.println(" ");
	    
	    System.out.println("Reduce price of hill publication by 10%: ");
	     for(int i=101;i<108;i++)
	     {
	    	 book h=w.get(i);
	     
	    if(h.publication=="hill")
	    {
	    	h.price=h.price-(0.1f*h.price);
	    }
	    h.dispBook();
	  } System.out.println(" ");
	    
	    System.out.println("delete");
	    System.out.println("enter the key to be delete");
	    int key=sc.nextInt();
	    w.remove(key);
	    //to retrieve
	    System.out.println("after delete:");
	    for(Map.Entry<Integer, book> mp : w.entrySet())
	    {
	    	System.out.print(mp.getKey()+" ");
	    	mp.getValue().dispBook();	
	    }System.out.println(" ");
    
	    
	    System.out.println("update");
	    System.out.println("enter the key and price to be update");
	    key=sc.nextInt();
	    int rate=sc.nextInt();
	    book b=w.get(key);
	    b.price=rate;
	    System.out.println("after update");
	    for(Map.Entry<Integer, book> mp : w.entrySet())
	    {
	    	System.out.print(mp.getKey()+" ");
	    	mp.getValue().dispBook();
	    }System.out.println(" ");
	    
	    System.out.println("enter the key to get particular book");
	    key=sc.nextInt();
	    book bk=w.get(key);
	    bk.dispBook();
	    
	    
	    
	     
	    
	    
	    
	    
	    
	    
	}

}


class book{
	String bookname;
	float price;
	String author;
	int isbn_no;
	String publication;
	public book(String bookname, float price, String author, int isbn_no, String publication) 
	{
		this.bookname = bookname;
		this.price = price;
		this.author = author;
		this.isbn_no = isbn_no;
		this.publication = publication;
	}
	public void dispBook() {
		System.out.println(bookname+" "+price+" "+author+" "+ isbn_no+" "+publication);
	}
}


