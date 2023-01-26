package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import enity.HistoricEvents;
import enity.History;

public class ReadFileEvents {
private ArrayList<HistoricEvents> historicEvent;
	
	public ReadFileEvents(ArrayList<HistoricEvents> historicEvent) {
		this.historicEvent = historicEvent;
	}
	
	public ReadFileEvents() {
		this.historicEvent = new ArrayList<HistoricEvents>();
	}


	private void readFile() throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("sukien3.json");
		Object obj = jsonParser.parse(reader);
		JSONArray culturList = (JSONArray)obj;
		for (Object object : culturList) {
			JSONObject jo = (JSONObject)object;
			HistoricEvents e1 = parse(jo);
			historicEvent.add(e1);
		}
		
	}
	private HistoricEvents parse(JSONObject jo) {
		ArrayList<String> personage=new ArrayList<String>();
		String name = (String)jo.get("name");
		String date = (String)jo.get("date");
		String descripton = (String)jo.get("description");
		
		Map person = ((Map)jo.get("Lien quan"));
		Iterator<Map.Entry> itr1 = person.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            personage.add((String)pair.getValue());
        }
		History e2 = new HistoricEvents(name, date,  descripton,personage) ;
		HistoricEvents e1 = (HistoricEvents) e2;
		return e1;
		
	}

	public ArrayList<HistoricEvents> getHistoricEvent() throws IOException, ParseException {
		readFile();
		return historicEvent;
	}
	
}
