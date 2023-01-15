package logic;

import java.io.Serializable;

public class StockRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int stock_request_id,machine_id;
	private String items_to_fill,status;
	
	public StockRequest(int stock_request_id,int machine_id,String items_to_fill,String status)
	{
		this.stock_request_id = stock_request_id;
		this.machine_id = machine_id;
		this.items_to_fill = items_to_fill;
		this.status = status;
	}

	public StockRequest() {
		// TODO Auto-generated constructor stub
	}

	public int getStock_request_id() {
		return stock_request_id;
	}

	public void setStock_request_id(int stock_request_id) {
		this.stock_request_id = stock_request_id;
	}

	public int getMachine_id() {
		return machine_id;
	}

	public void setMachine_id(int machine_id) {
		this.machine_id = machine_id;
	}

	public String getItems_to_fill() {
		return items_to_fill;
	}

	public void setItems_to_fill(String items_to_fill) {
		this.items_to_fill = items_to_fill;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override 
	public String toString()
	{
		return "Stock Request : " + this.machine_id + " -> " + this.items_to_fill;
	}

}
