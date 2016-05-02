package monsters;

import java.util.Iterator;

public class MonsterStats {
	
	//each monster has attack, defense, and speed; stored as integer values
	protected int attack, defense, speed, hp, level;
	
	public MonsterStats(){
		this.attack = -1;
		this.defense = -1;
		this.speed = -1;
		this.hp = -1;
		this.level = -1;
	}
	
	public MonsterStats(Iterator<String> iterator){
		while (iterator.hasNext()){
			String splitStats[] = iterator.next().split(":");
			String name = splitStats[0];
			int val = Integer.parseInt(splitStats[1]);
			if (name.equals("Attack")){
				this.attack = val;
			}
			else if (name.equals("Defense")){
				this.defense = val;
			}
			else if (name.equals("Speed")){
				this.speed = val;
			}
			else if (name.equals("HP")){
				this.hp = val;
			}
			else if (name.equals("Level")){
				this.level = val;
			}
		}
	}
	
	protected void printMonsterStats(){
		System.out.println("Stats: ");
		System.out.println("  Attack: " + attack);
		System.out.println("  Defense: " + defense);
		System.out.println("  Speed: " + speed);
		System.out.println("  HP: " + hp);
		System.out.println("  Level: " + level);
	}

}
