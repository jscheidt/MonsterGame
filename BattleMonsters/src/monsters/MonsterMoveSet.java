package monsters;

import java.util.ArrayList;

public class MonsterMoveSet {

	//stores a list of move thats the monster has
	//also tracks number of moves remaining
	ArrayList<move.Move> MonsterMoves = new ArrayList<move.Move>();
	
	public MonsterMoveSet(move.TotalMoves tm){
		move.Move move1 = new move.Move(tm.moveList.get(0));
//		MonsterMoves.add(e)
		
	}
}
