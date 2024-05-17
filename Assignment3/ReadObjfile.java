import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class ReadObjfile {
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		Studentt s1= new Studentt(101,"asd",67);
		Studentt s2= new Studentt(102,"qwe",75);
		Studentt s3= new Studentt(103,"zxc",40);
		Studentt s4= new Studentt(104,"rty",29);
		Studentt s5= new Studentt(105,"cvb",90);
		
		ArrayList<Studentt> al= new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		Studentt.sortbymarks(al);
		for(Studentt obj:al) {
			obj.display();
		}
		
		FileOutputStream fo= new FileOutputStream("soc.txt");
		ObjectOutputStream oo= new ObjectOutputStream(fo);
		oo.writeObject(s1);
		oo.writeObject(s2);
		oo.writeObject(s3);
		oo.writeObject(s4);
		oo.writeObject(s5);
		
		fo.close();
		oo.close();
		try {
		FileInputStream fr= new FileInputStream("soc.txt");
		ObjectInputStream oi= new ObjectInputStream(fr);
		while((s1=(Studentt)oi.readObject())!=null) {
			s1.display();
			s1.findresult();
		}
		while((s2=(Studentt)oi.readObject())!=null) {
			s2.display();
			s2.findresult();
		}
		while((s3=(Studentt)oi.readObject())!=null) {
			s3.display();
			s3.findresult();
		}
		while((s4=(Studentt)oi.readObject())!=null) {
			s4.display();
			s4.findresult();
		}
		while((s5=(Studentt)oi.readObject())!=null) {
			s5.display();
			s5.findresult();
		}
		fr.close();
		oi.close();
		}
		catch(EOFException e) {
			System.out.println("EOF");
		}
		
		
	
	}
	

}
