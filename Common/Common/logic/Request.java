package logic;

import java.io.Serializable;

public class Request implements Serializable {
	private static final long serialVersionUID = 1L;
	private int request_id, customer_id;
	private String type, status;
	
	public Request() {
		
	}
	
	public Request(int request_id, int customer_id, String type,String status) {
		this.request_id = request_id;
		this.customer_id = customer_id;
		this.type = type;
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

