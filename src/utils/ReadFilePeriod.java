package utils;

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

import enity.HistoricalSites;
import enity.History;
import enity.ListSites;
import enity.Period;
import enity.Personage;
import enity.list_personage;

public class ReadFilePeriod {
	private ArrayList<Period> periodLists;

	public ReadFilePeriod(ArrayList<Period> periodLists) {
		this.periodLists = periodLists;
	}
	public ReadFilePeriod() {
		this.periodLists = new ArrayList<Period>();
	}
	
	
	
	public ArrayList<Period> getPeriodLists() {
		readFile();
		return periodLists;
	}
	private void readFile() {
		JSONParser jsonParser = new JSONParser();
		try (FileReader reader = new FileReader("thoiki1.json")) {
            // Read JSON file
            Object obj = jsonParser.parse(reader);
            
            JSONArray userList = (JSONArray) obj;
//            System.out.println(userList);
            for (Object object : userList) {
//				parseUserObject((JSONObject)object);
            	JSONObject jo = (JSONObject)object;
            	Period e1 = parse(jo);
            	periodLists.add(e1);
			}
            // Iterate over employee array

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
	}
	
	
	private Period parse(JSONObject jo) throws IOException, ParseException {
		list_personage lp = new list_personage();
		ReadFilePersonage rfp = new ReadFilePersonage();
		ReadFileSites rfs = new ReadFileSites();
		ListSites ls = new ListSites();
		ArrayList<Personage> personageList= new ArrayList<Personage>();
		ArrayList<String> personageList1= new ArrayList<String>();
		ArrayList<HistoricalSites> historicSites = new ArrayList<HistoricalSites>();
		ArrayList<String> historicSites1 = new ArrayList<String>();
		String name = (String)jo.get("date");
		String date = (String)jo.get("Thoi Ki");
		String description = (String)jo.get("description");
		JSONObject jr = (JSONObject)jo.get("Relate");
		
		Map person = ((Map)jr.get("Nhan vat"));
		Iterator<Map.Entry> itr1 = person.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            Personage e = lp.searchByName1(rfp.getPersonageList(),(String)pair.getValue());
            personageList.add(e);
            personageList1.add((String)pair.getValue());
        }
        Map site = ((Map)jr.get("Dia danh"));
		Iterator<Map.Entry> itr2 = site.entrySet().iterator();
        while (itr2.hasNext()) {
            Map.Entry pair = itr2.next();
            HistoricalSites a = ls.searchByName1(rfs.getHistoricSites(),(String)pair.getValue());
            historicSites.add(a);
            historicSites1.add((String)pair.getValue());
        }
        History e2 = new Period(name, date, description, personageList, personageList1, historicSites, historicSites1) ;
        Period e1 = (Period) e2;
		
		return e1;
	}
}
