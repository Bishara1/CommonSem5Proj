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
	
	DatabaseWrite {
		@Override
		public String toString() {
			return "Database Write";
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
	
	ReadRequests {
		@Override
		public String toString() {
			return "Read Requests";
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
			
			default:
				return "Illegal Command";
		}
	}
}
