import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStringBased {
	public static void main(String[] args) throws IOException{
		
		FileWriter fw= new FileWriter("doc.txt");
		String str="This is a string based file program";
		fw.write(str);
		System.out.println("the text is written!!");
		fw.close();
		
		FileReader fr= new FileReader("doc.txt");
		//int ch=fr.read();
		System.out.println("the text is retrived");
		//System.out.println(ch);
		int ch1;
		while((ch1=fr.read())!=-1) {
			System.out.print((char)ch1);
		}
		
	}

}
