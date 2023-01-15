package logic;

import java.io.Serializable;

public class InventoryReports implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String location, inventory, stock, month, year;
	private int report_id, machine_id;
	
	public InventoryReports() {
		
	}
	
	public InventoryReports(String location, String inventory, String stock, String month, String year, int report_id, int machine_id) {
		super();
		this.location = location;
		this.inventory = inventory;
		this.stock = stock;
		this.month = month;
		this.year = year;
		this.report_id = report_id;
		this.machine_id = machine_id;
	}
	
	public String getInventory() {
		return inventory;
	}

	public void setInventory(String inventory) {
		this.inventory = inventory;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getReport_id() {
		return report_id;
	}

	public void setReport_id(int report_id) {
		this.report_id = report_id;
	}

	public int getMachine_id() {
		return machine_id;
	}

	public void setMachine_id(int machine_id) {
		this.machine_id = machine_id;
	}

	@Override
	public String toString() {
		return "InventoryReports [location=" + location + ", stock=" + stock + ", month=" + month + ", year=" + year
				+ ", report_id=" + report_id + ", machine_id=" + machine_id + "]";
	}
	
}
