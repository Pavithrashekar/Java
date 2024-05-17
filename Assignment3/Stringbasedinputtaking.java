import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Stringbasedinputtaking {
	public static void main(String[] args) throws IOException {
		String str;
		String str1;
		String str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first text:");
		//System.out.println("Enter text:");
		str=sc.nextLine();
		System.out.println("Enter second text:");
		str1=sc.nextLine();
		System.out.println("Enter third text:");
		str2=sc.nextLine();
		
		FileWriter fw = new FileWriter("docc.txt");
		fw.write(str);
		fw.write(str1);
		fw.write(str2);
		
		fw.close();
		//System.out.println("Both texts are entered!!");
		System.out.println("Texts entered!!");
		
		FileReader fr= new FileReader("docc.txt");
		BufferedReader br = new BufferedReader(fr);
		//String s=br.readLine();
		//String t=br.readLine();
		//System.out.println("Both texts are recieved!!");
		System.out.println("Texts recieved!!");
		
		//System.out.println(s);
		
		int countlines=0;
		while(br.readLine()!=null) {
			countlines++;
		}
		
		br.close();
		fr.close();
		System.out.println("The no of line in the file are:"+countlines);
		
		//System.out.println("no of characters are"+s.length());
		
		//String[] srr;
		//srr=s.split(" ");
		//System.out.println("the no of words are:"+srr.length);
		
		
	}

}
