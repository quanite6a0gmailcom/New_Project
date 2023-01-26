package enity;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class list_personage implements HistoryMethod {
	public void show(ArrayList<Personage> pel) {
		for (Personage personage : pel) {
			System.out.println(personage);
		}
		
	}
	
	public void searchByName(ArrayList<Personage> pel,String name) {
		for (Personage personage : pel) {
			if(personage.getName().toLowerCase().indexOf(name.toLowerCase())>=0) {
				System.out.println(personage);
			}
		}
	}
	
	public Personage searchByName1(ArrayList<Personage> pel,String name){
		for (Personage personage : pel) {
			if(personage.getName().toLowerCase().indexOf(name.toLowerCase())>=0) {
				return personage;
			}
		}
		return null;
	}
	
	public void searchID(ArrayList<Personage> pel,int id) {
		for (Personage personage : pel) {
			if(personage.getId()==id) {
				System.out.println(personage);
			}
		}
	}
	
}
