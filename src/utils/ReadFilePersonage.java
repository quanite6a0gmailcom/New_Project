package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import enity.History;
import enity.Personage;

public class ReadFilePersonage {
	private ArrayList<Personage> personageList;

	
	public ArrayList<Personage> getPersonageList() throws IOException, ParseException {
		readFile();
		return personageList;
	}

	public ReadFilePersonage(ArrayList<Personage> personageList) {
		this.personageList = personageList;
	}
	
	public ReadFilePersonage() {
		this.personageList = new ArrayList<Personage>();
	}
	
	
	
	private void readFile() throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("nhanvat3.json");
		Object obj = jsonParser.parse(reader);
		JSONArray personlist = (JSONArray) obj;
		for (Object object : personlist) {
			JSONObject jo = (JSONObject)object;
			Personage e1 = parse(jo);
			personageList.add(e1);
		}
//		for (Object object : personageList) {
//			System.out.println(object);
//		}
		
	}
	
	private Personage parse(JSONObject obj) {
		Personage e1;
		String name =(String) obj.get("name");
		String date = (String)obj.get("date");
		String description = (String)obj.get("description");
		String imageUrl = (String)obj.get("imageUrl");
		History e2=new Personage(name, date,description,imageUrl);
		e1 = (Personage) e2;
		return e1;
		
	}
}
