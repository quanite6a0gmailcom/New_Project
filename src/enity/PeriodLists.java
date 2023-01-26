package enity;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PeriodLists implements HistoryMethod {
	
	public void show(ArrayList<Period> pe) {
		for (Period period : pe) {
			System.out.println(period);
		}
	}
	
	public void searchByName(ArrayList<Period> pe,String name) {
		for (Period period : pe) {
			if(period.getName().toLowerCase().indexOf(name.toLowerCase())>=0) {
				System.out.println(period);
			}
		}
	}
	
	public void searchID(ArrayList<Period> pe,int id) {
		for (Period period : pe) {
			if(period.getId()==id) {
				System.out.println(period);
		}
	}
	}
	
	public void searchRelatePersonage(ArrayList<Period> pr,String name) {
		ArrayList<Personage>pe = new ArrayList<Personage>();
		for (Period period : pr) {
			pe = period.getPersonageList();
			for (Personage personage : pe) {
				if(personage.getName().toLowerCase().indexOf(name.toLowerCase())>=0) {
					System.out.println(personage);
				}
			}
		}
	}
	
	public void searchRelateSite(ArrayList<Period> pr,int id) {
		ArrayList<HistoricalSites> hs = new ArrayList<HistoricalSites>();
		for (Period period : pr) {
			hs = period.getHistoricSites();
			System.out.println(hs.toArray()[id]);
		}
	}
}
