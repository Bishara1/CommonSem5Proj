package common;

public enum Command {
	Connect { 
		@Override
		public String toString() {
			return "Connect";
		}
	},
	
	Disconnect {
		@Override
		public String toString() {
			return "Disconnect";
		}
	},
	
	DatabaseUpdate {
		@Override
		public String toString() {
			return "Database Update";
		}
	},
	
	DatabaseRead{
		@Override
		public String toString() {
			return "Database Read";
		}
	},
	
	InsertUser {
		@Override
		public String toString() {
			return "Insert User";
		}
	},
	
	InsertOrder {
		@Override
		public String toString() {
			return "Insert Order";
		}
	},

	InsertOrderReport {
		@Override
		public String toString() {
			return "Insert Order Report";
		}
	},
	
	InsertInventoryReport{
		@Override
		public String toString() {
			return "Insert Inventory Report";
		}
	},
	
	
	//----------------------------------------------------------------
	//SQL query enums
	//----------------------------------------------------------------
	
	ReadMachines {
		@Override
		public String toString() {
			return "Read Machines";
		}
	},
	
	ReadUsers {
		@Override
		public String toString() {
			return "Read Users";
		}
	},
	
	ReadDeliveries {
		@Override
		public String toString() {
			return "Read Deliveries";
		}
	},
	
	ReadOrders {
		@Override
		public String toString() {
			return "Read Orders";
		}
	},
	
	UpdateOrders {
		@Override
		public String toString() {
			return "Update Orders";
		}
	},
	
	ReadRequests {
		@Override
		public String toString() {
			return "Read Requests";
		}
	},
	
	ReadItems {
		@Override
		public String toString() {
			return "Read Items";
		}
	},
	
	ReadLocations{
		@Override
		public String toString() {
			return "Read Location";
		}
	},
	
	ReadOrdersReports{
		@Override
		public String toString() {
			return "Read Order reports";
		}
	},
	
	UpdateMachineStock{
		@Override
		public String toString() {
			return "Update Machine Stock";
		}
	};
	
	public String GetQuery() {
		switch(this) {
			case ReadMachines:
				return "SELECT * FROM machines";
			
			case ReadUsers:
				return "SELECT * FROM users";
			
			case ReadOrders:
				return "SELECT * FROM orders";
			
			case ReadRequests:
				return "SELECT * FROM requests";
			
			case ReadDeliveries:
				return "SELECT * FROM delivery";
				
			case ReadItems:
				return "SELECT * FROM items";
				
			case ReadLocations:
				return "SELECT * FROM location";
				
			case ReadOrdersReports:
				return "SELECT * FROM ordersreport";
			
			case UpdateMachineStock:
				return "UPDATE machines SET amount_per_item = ?? WHERE machine_id = ??"; 
			
			default:
				return "Illegal Command";
		}
	}
	
	public String GetID() {
		switch(this) {
			case ReadMachines:
				return "machine_id";
			
			case ReadUsers:
				return "ID";
			
			case ReadOrders:
				return "order_number";
			
			case ReadRequests:
				return "request_id";
			
			case ReadDeliveries:
				return "delivery_id";
				
			case ReadItems:
				return "name";
				
			case ReadLocations:
				return "name";
				
			case ReadOrdersReports:
				return "report_id";
				
			case InsertOrderReport:
				return "report_id";
				
			case InsertInventoryReport:
				return "machine_id";
				
			default:
				return "Illegal Command";
		}
	}
}
