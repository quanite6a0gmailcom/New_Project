package enity;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CulturalList implements HistoryMethod {
	
	public void show(ArrayList<CulturalFestival> cr)  {
		for (CulturalFestival culturalFestival : cr) {
			System.out.println(culturalFestival);
		}
	}
	
	public void searchByName(ArrayList<CulturalFestival> cr,String name) {
		for (CulturalFestival culturalFestival : cr) {
			if(culturalFestival.getName().toLowerCase().indexOf(name)>=0) {
				System.out.println(culturalFestival);
			}
		}
	}
	
	public void searchID(ArrayList<CulturalFestival> cr,int id){
		for (CulturalFestival culturalFestival : cr) {
			if(culturalFestival.getId()==id) {
				System.out.println(culturalFestival);
			}
		}
	}

	
	
}
