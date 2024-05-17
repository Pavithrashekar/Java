import java.util.Comparator;
public class Sortbymarks implements Comparator<Studentt>{

	@Override
	public int compare(Studentt o1, Studentt o2) {
		// TODO Auto-generated method stub
		if(o1.marks>o2.marks) {
			return 1;
		}
		else {
		return -1;
	}
	
	}
}
