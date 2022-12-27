package logic;

import java.io.Serializable;

public class Request implements Serializable {
	private static final long serialVersionUID = 1L;
	private int request_id, customer_id;
	private String type;
	
	public Request() {
		
	}
	
	public Request(int request_id, int customer_id, String type) {
		this.request_id = request_id;
		this.customer_id = customer_id;
		this.type = type;
	}

	public int getRequest_id() {
		return request_id;
	}

	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

