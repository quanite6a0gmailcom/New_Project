package enity;

import java.util.ArrayList;
import java.util.List;

public class HistoricEvents extends History {
	private static int ID=0;
	private int id;
	private ArrayList<String> personage;
	
	
	
	public HistoricEvents(String name, String date, String description,  ArrayList<String> personage) {
		super(name, date, description);
		this.id = ++ID;
		this.personage = personage;
	}
	
	


	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public ArrayList<String> getPersonage() {
		return personage;
	}




	public void setPersonage(ArrayList<String> personage) {
		this.personage = personage;
	}




	@Override
	public String toString() {
		return "HistoricEvents [id=" + id + ", name=" + name + ", date=" + date + ", personage=" + personage.toString()
				+ ", description=" + description + "]";
	}
	
	
	
	
	
	
	
}
