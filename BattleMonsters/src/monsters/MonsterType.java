package monsters;

public class MonsterType {

	//The different types a monster can be right now are
	//0=air, 1=water, 2=grass, 3=fire;
	
	protected int type;
	protected String name;
	protected String nameArray[] = {"air", "water", "grass", "fire"};
	public MonsterType(){
		type = 0;
		name = nameArray[type];
	}
	
	public MonsterType(int type){
		this.type = type;
		this.name = nameArray[type];
	}
	
	protected void printMonsterType(){
		System.out.println("Type:");
		System.out.println("  Id: " + this.type);
		System.out.println("  Name: " + this.name);
		
		System.out.println("added new line for testing");
	}
}
