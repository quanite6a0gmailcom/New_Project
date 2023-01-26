package enity;

import java.util.ArrayList;

public class HistoricalSites extends History {
	private static int ID=0;
	private int id;
	private ArrayList<String>relatePerson;
	private ArrayList<String>relateSite;
	
	
	public HistoricalSites(String name,String description,  ArrayList<String> relatePerson,
			ArrayList<String> relateSite) {
		super(name, description);
		this.id = ++ID;
		this.relatePerson = relatePerson;
		this.relateSite = relateSite;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public ArrayList<String> getRelatePerson() {
		return relatePerson;
	}



	public void setRelatePerson(ArrayList<String> relatePerson) {
		this.relatePerson = relatePerson;
	}



	public ArrayList<String> getRelateSite() {
		return relateSite;
	}



	public void setRelateSite(ArrayList<String> relateSite) {
		this.relateSite = relateSite;
	}



	@Override
	public String toString() {
		return "HistoricalSites [id=" + id + ", name=" + name + ", description=" + description + ", relatePerson="
				+ relatePerson.toString() + ", relateSite=" + relateSite.toString() + "]";
	}
	
	
	
	
}
