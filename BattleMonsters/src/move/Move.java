package move;

import org.json.simple.JSONObject;

public class Move {

	protected String name;
	protected int id;
	protected int damage, accuracy, numOfMovesTotal, numOfMovesLeft, type;

	public Move() {
		this.name = "None";
		this.id = -1;
		this.damage = -1;
		this.accuracy = -1;
		this.numOfMovesTotal = -1;
		this.numOfMovesLeft = this.numOfMovesTotal;
		this.type = -1;
	}
	public Move(Move other){
		this.name = other.name;
		this.id = other.id;
		this.damage = other.damage;
		this.accuracy = other.accuracy;
		this.numOfMovesTotal = other.numOfMovesTotal;
		this.numOfMovesLeft = other.numOfMovesLeft;
		this.type = other.type;
	}

	public Move(JSONObject move) {
		this.id = Integer.parseInt((String) move.get("id"));
		this.accuracy = Integer.parseInt((String) move.get("accuracy"));
		this.damage = Integer.parseInt((String) move.get("damage"));
		this.numOfMovesTotal = Integer.parseInt((String) move.get("numOfMoves"));
		this.numOfMovesLeft = this.numOfMovesTotal;
		this.type = Integer.parseInt((String) move.get("type"));
		this.name = (String) move.get("name");
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void printMoveDetails(){
		System.out.println("Move:");
		System.out.println("  Id: " + this.id);
		System.out.println("  Name: " + this.name);
		System.out.println("  Type: " + this.type);
		System.out.println("  Damage: " + this.damage);
		System.out.println("  Accuracy: " + this.accuracy);
		System.out.println("  Number of Moves: " + this.numOfMovesLeft + "/" + this.numOfMovesTotal);
	}
}
