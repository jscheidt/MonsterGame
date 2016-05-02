package move;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TotalMoves {
	
	public ArrayList<Move> moveList = new ArrayList<Move>();
	
	public TotalMoves(){
	}

	public TotalMoves(String filename) {
		JSONParser parser = new JSONParser();

		try {
			Object obj = parser.parse(new FileReader(filename));
			JSONObject jo = (JSONObject) obj;
			JSONArray statList = (JSONArray) jo.get("moves");

			
		     Iterator i = statList.iterator();
		     while (i.hasNext()){
		    	 JSONObject move = (JSONObject) i.next();
		    	 Move m = new Move(move);
//		    	 m.printMoveDetails();
		    	 moveList.add(m);
		     }

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
}
