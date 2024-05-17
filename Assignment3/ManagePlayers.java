import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ManagePlayers {
	public ArrayList<Players> createPlayers(ArrayList<Players> al) {
		Players p1= new Players("asd",800,8,'a');
		Players p2= new Players("qwe",1100,11,'b');
		Players p3= new Players("zxc",1200,12,'a');
		Players p4= new Players("rty",600,6,'b');
		Players p5= new Players("cvb",900,9,'a');
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		System.out.println("Created!!");

		return al;
		
	}
	public static void ddisplay(ArrayList<Players> al) {
		for(Players obj:al) {
			if(al!=null) {
			obj.display();
		}
		}
	}
	
	public void removePlayers(ArrayList<Players> al) {
		Iterator<Players> it = al.iterator() ;
		while(it.hasNext()) {
			if(it.next().getTtlruns()<=800) {
				it.remove();
			}
		}
		ddisplay(al);
	}
	public void maxOfPlayers(ArrayList<Players> al) {
		Players maxRunsplayer=Collections.max(al,Comparator.comparingInt(Players::getTtlruns));
		System.out.println("the player with max runs is:"+maxRunsplayer.pname);
	}
	
	public void sortPlayersbyName(ArrayList<Players> al) {
		SortByName sm= new SortByName();
		Collections.sort(al,sm);
		ddisplay(al);
	}
	public void sortPlayersbyRuns(ArrayList<Players> al) {
		SortByRuns sr= new SortByRuns();
		Collections.sort(al,sr);
		ddisplay(al);
	}
	public void updatecategory(ArrayList<Players> al) {
		Iterator it= al.iterator();
		Players p=(Players) it.next();
		while(it.hasNext()) {
			if(p.getNofcens()>10) {
				p.setNofcens('a');
			}
			else {
				p.setNofcens('b');
			}
		}
		ddisplay(al);
	   
	}

}
