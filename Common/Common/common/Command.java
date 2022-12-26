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
		public String GetAll() {
			return "Select * from machines";
		}
		
		public String GetSpecificMachine(int machine_id) {
			return "Select * from machines WHERE machine_id = " + machine_id;
		}
		
		@Override
		public String toString() {
			return "Read Machines";
		}
	};
}
