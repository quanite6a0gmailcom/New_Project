package utils;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import enity.*;

public class ReadFileCultural {
	private ArrayList<CulturalFestival> cuturalList;

	public ReadFileCultural(ArrayList<CulturalFestival> cuturalList) {
		this.cuturalList = cuturalList;
	}
	
	public ReadFileCultural() {
		this.cuturalList = new ArrayList<CulturalFestival>();
		
	}
	
	
	
	public ArrayList<CulturalFestival> getCuturalList() throws IOException, ParseException {
		readFile();
		return this.cuturalList;
	}


	private void readFile() throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("lehoi1.json");
		Object obj = jsonParser.parse(reader);
		JSONArray culturList = (JSONArray)obj;
		for (Object object : culturList) {
			JSONObject jo = (JSONObject)object;
			CulturalFestival e1 = parse(jo);
			cuturalList.add(e1);
		}
//		for (Object object : cuturalList) {
//			System.out.println(object);
//		}
	}
	
	private CulturalFestival parse(JSONObject jo) {
		String name = (String)jo.get("name");
		String date = (String)jo.get("date");
		String address = (String)jo.get("address");
		String descripton = (String)jo.get("description");
		History e2 = new CulturalFestival(name, date, address, descripton);
		CulturalFestival e1 = (CulturalFestival) e2;
		return e1;
		
	
	

	
	

	
	
}
}
