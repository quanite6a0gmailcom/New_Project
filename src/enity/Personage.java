package enity;

import java.util.Map;

public class Personage extends History {
	private static int ID=0;
	private int id;
	private String urlImage;
	
	
	
	public Personage(String name, String date, String description, String urlImage) {
		super(name, date, description);
		this.id = ++ID;
		this.urlImage = urlImage;
	}

	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getUrlImage() {
		return urlImage;
	}



	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}



	@Override
	public String toString() {
		return "Personage [id=" + id + ", name=" + name + ", date=" + date + ", urlImage=" + urlImage + ", description="
				+ description + "]";
	}
	
	
	
}
