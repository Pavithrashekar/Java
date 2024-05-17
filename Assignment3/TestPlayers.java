import java.util.ArrayList;
import java.util.Scanner;
public class TestPlayers {

	public static void main(String[] args) {
		ManagePlayers mp= new ManagePlayers();
		ArrayList<Players> al= new ArrayList<>();
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("What do you want?");
			System.out.println("1.create");
			System.out.println("2.find max player");
			System.out.println("3.sort players by name");
			System.out.println("4.sort players by runs");
			System.out.println("5.remove players who are less than 800");
			System.out.println("6.updatecategory of players");
		    System.out.println("Enter your choice:");
		    choice=sc.nextInt();
		    switch(choice) {
		    case 1: mp.createPlayers(al);
		    break;
		    case 2: mp.maxOfPlayers(al);
		    break;
		    case 3: mp.sortPlayersbyName(al);
		    break;
		    case 4: mp.sortPlayersbyRuns(al);
		    break;
		    case 5: mp.removePlayers(al);
		    break;
		    case 6: mp.updatecategory(al);
		    break;
		    default : System.out.println("Enter valid choice(1-7)!!");
		    return;
		    }
		
		}while(choice<=7);
      }
}
