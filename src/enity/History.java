package enity;

public abstract class History {
	protected String name;
	protected String date;
	protected String description;
	public History(String name, String date, String description) {
		this.name = name;
		this.date = date;
		this.description = description;
	}
	
	public History(String name,  String description) {
		this.name = name;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public abstract String toString();
	
	
}
