package monsters;

import java.util.ArrayList;
import java.util.Scanner;

public class MonsterMoveSet {

	// stores a list of move thats the monster has
	// also tracks number of moves remaining
	ArrayList<move.Move> MonsterMoves = new ArrayList<move.Move>();

	protected move.Move move1,move2,move3,move4;

	public MonsterMoveSet(move.TotalMoves tm) {
		move1 = new move.Move(tm.moveList.get(0));
		MonsterMoves.add(move1);
	}
	//check if there are 4 moves, if not add new 
	public void addMoveToSet(move.Move move){
		if (MonsterMoves.size() == 4){
			//remove a move
			System.out.println("choose which move to replace");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			replaceMove(move, num);
		}
		else{
			MonsterMoves.add(move);
		}
	}
	
	public void replaceMove(move.Move move, int num){
		System.out.println("Replaced " + MonsterMoves.get(num).getName() + " with " + move.getName());
		MonsterMoves.set(num, move);
	}
	
	public void printMove(int num){
		if (MonsterMoves.size() >= num){
			System.out.println(num + "= No Move");
		}
		else
			System.out.print(num + " ");
			MonsterMoves.get(num).printMoveDetails();
	}
	
	public void printAllMoves(){
		for (int i = 0; i < MonsterMoves.size(); i++){
			this.printMove(i);
		}
	}
}
