package logic;

import java.io.Serializable;

public class Location implements Serializable {
	private static final long serialVersionUID = 1L;
	private String location;
	private int sale_value;
	
	public Location(String location, int sale_value) {
		this.location = location;
		this.sale_value = sale_value;
	}

	public String getLocation() {
		return location;
	}


	public int getSale_value() {
		return sale_value;
	}
}
