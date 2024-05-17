import java.util.Comparator;
public class SortByRuns implements Comparator<Players> {

	@Override
	public int compare(Players o1, Players o2) {
		// TODO Auto-generated method stub
		if(o1.getTtlruns()>o2.getTtlruns()) {
		return 1;
	}
		else {
			return -1;
		}
	

}
}
