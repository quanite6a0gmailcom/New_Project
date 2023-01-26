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

public class ListSites implements HistoryMethod {
	public void show(ArrayList<HistoricalSites> hs){
		for (HistoricalSites historicalSites : hs) {
			System.out.println(historicalSites);
		}
	}
	
	public void searchByName(ArrayList<HistoricalSites> hs,String name){
		for (HistoricalSites historicalSites : hs) {
			if(historicalSites.getName().toLowerCase().indexOf(name.toLowerCase())>=0){
				System.out.println(historicalSites);
			}
		}
	}
	
	public HistoricalSites searchByName1(ArrayList<HistoricalSites> hs,String name)  {
		for (HistoricalSites historicalSites : hs) {
			if(historicalSites.getName().toLowerCase().indexOf(name.toLowerCase())>=0) {
				return historicalSites;
			}
		}
		return null;
	}
	
	public void searchID(ArrayList<HistoricalSites> hs,int id)  {
		for (HistoricalSites historicalSites : hs) {
			if(historicalSites.getId()==id) {
				System.out.println(historicalSites);
			}
		}
	}


	
}
