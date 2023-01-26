package enity;

public class CulturalFestival extends History {
	private static int ID=0;
	private int id;
	private String address;
	
	

	public CulturalFestival(String name, String date, String description, String address) {
		super(name, date, description);
		this.id = ++ID;
		this.address = address;
	}

	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "CulturalFestival [id=" + id + ", name=" + name + ", date=" + date + ", address=" + address
				+ ", description=" + description + "]";
	}
	
	
	
}
