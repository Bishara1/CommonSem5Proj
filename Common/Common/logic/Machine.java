package logic;

public class Machine {
	private int machine_id, threshold, total_inventory;
	private String location, items, amount_per_item;
	
	public Machine() {
		
	}
	
	public Machine(int machine_id, int threshold, int total_inventory, String location, String items, String amount_per_item) {
		this.machine_id = machine_id;
		this.threshold = threshold;
		this.total_inventory = total_inventory;
		this.location = location;
		this.items = items;
		this.amount_per_item = amount_per_item;
	}

	public int getMachine_id() {
		return machine_id;
	}

	public void setMachine_id(int machine_id) {
		this.machine_id = machine_id;
	}

	public int getThreshold() {
		return threshold;
	}

	public void setThreshold(int threshold) {
		this.threshold = threshold;
	}

	public int getTotal_inventory() {
		return total_inventory;
	}

	public void setTotal_inventory(int total_inventory) {
		this.total_inventory = total_inventory;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public String getAmount_per_item() {
		return amount_per_item;
	}

	public void setAmount_per_item(String amount_per_item) {
		this.amount_per_item = amount_per_item;
	}

	
	// items and amount per item split
}
