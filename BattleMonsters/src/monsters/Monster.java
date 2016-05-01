package monsters;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Monster {

	//monster has a name, id, type
	protected String name;
	protected int id;
	//stats
	protected int attack, defense, speed;
	protected MonsterType mt;
	protected MonsterStats ms;
	
	public Monster(){
		this.name = "NoConstruct";
		this.id = -1;
		this.mt = new MonsterType();
		this.ms = new MonsterStats();
	}
	
	@SuppressWarnings("unchecked")
	public Monster(String filename){
		JSONParser parser = new JSONParser();
		
		try {
			Object obj = parser.parse(new FileReader(filename));
			JSONObject jo = (JSONObject) obj;
			this.name = (String) jo.get("Name");
			this.id = ((Long)jo.get("Id")).intValue();
			int type = ((Long)jo.get("Type")).intValue();
			this.mt = new MonsterType(type);
			JSONArray statList = (JSONArray) jo.get("Stats");
			
			this.ms = new MonsterStats(statList.iterator());
			
		} catch (FileNotFoundException e) {
			System.out.println("Can't find the file: " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Incorrect Input/Output");
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Parsing Exception with JSON");
			e.printStackTrace();
		}
		
	}
	
	private void printMonsterInfo(){
		System.out.println("Monster Info:");
		System.out.println("  Id: " + this.id);
		System.out.println("  Name: " + this.name);
		
	}
	protected void printAllInfo(){
		this.printMonsterInfo();
		this.mt.printMonsterType();
		this.ms.printMonsterStats();
	}
}
