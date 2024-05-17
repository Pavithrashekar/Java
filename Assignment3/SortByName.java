import java.util.Comparator;
public class SortByName implements Comparator<Players> {

	@Override
	public int compare(Players o1, Players o2) {
		// TODO Auto-generated method stub
		return o1.getPname().compareTo(o2.getPname());
	}

}
