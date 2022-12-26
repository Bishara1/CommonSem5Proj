package logic;

public class Machine {
	private int machine_code, threshold, total_inventory;
	private String location, items, amount_per_item;

	public Machine(int machine_code, int threshold, int total_inventory, String location, String items, String amount_per_item) {
		this.machine_code = machine_code;
		this.threshold = threshold;
		this.total_inventory = total_inventory;
		this.location = location;
		this.items = items;
		this.amount_per_item = amount_per_item;
	}

	public int getMachine_code() {
		return machine_code;
	}

	public int getThreshold() {
		return threshold;
	}

	public int getTotal_inventory() {
		return total_inventory;
	}

	public String getLocation() {
		return location;
	}
	
	// items and amount per item split
}
