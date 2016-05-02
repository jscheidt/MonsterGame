package monsters;

public class MainMonster {


	public static void main (String[] args){
		
		
		move.TotalMoves tm = new move.TotalMoves("movelist.txt");
		
		Monster m1= new Monster("0birdo.txt");
		m1.printAllInfo();
		
		Monster m2 = new Monster("1chompy.txt");
		m2.printAllInfo();
	}
}
