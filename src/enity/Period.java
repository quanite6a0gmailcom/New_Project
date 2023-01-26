package enity;

import java.util.ArrayList;

public class Period extends History {
	private static int ID=0;
	private int id;
	private ArrayList<Personage> personageList;
	private ArrayList<String> personageList1;
	private ArrayList<HistoricalSites> historicSites;
	private ArrayList<String> historicSites1;

	public Period(String name, String date, String description,  ArrayList<Personage> personageList,
			ArrayList<String> personageList1, ArrayList<HistoricalSites> historicSites,ArrayList<String> historicSites1) {
		super(name, date, description);
		this.id = ++ID;
		this.personageList = personageList;
		this.personageList1 = personageList1;
		this.historicSites = historicSites;
		this.historicSites1 = historicSites1;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Personage> getPersonageList() {
		return personageList;
	}

	public void setPersonageList(ArrayList<Personage> personageList) {
		this.personageList = personageList;
	}

	public ArrayList<String> getPersonageList1() {
		return personageList1;
	}

	public void setPersonageList1(ArrayList<String> personageList1) {
		this.personageList1 = personageList1;
	}

	

	public ArrayList<HistoricalSites> getHistoricSites() {
		return historicSites;
	}

	public void setHistoricSites(ArrayList<HistoricalSites> historicSites) {
		this.historicSites = historicSites;
	}

	public ArrayList<String> getHistoricSites1() {
		return historicSites1;
	}

	public void setHistoricSites1(ArrayList<String> historicSites1) {
		this.historicSites1 = historicSites1;
	}

	@Override
	public String toString() {
		return "Period [id=" + id + ",name="+ name +",date="+ date+ ",description="+ description + ", personageList1=" + personageList1
				+ ", historicSites=" + historicSites1 + "]";
	}


	
	
	
	
	
}
