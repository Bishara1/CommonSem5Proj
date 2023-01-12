package logic;

import java.io.Serializable;

public class StockRequest implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int stock_request_id,machine_id;
	private String status;
	
	public StockRequest(int stock_request_id,int machine_id,String status)
	{
		this.stock_request_id = stock_request_id;
		this.machine_id = machine_id;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override 
	public String toString()
	{
		return "Stock Request : " + this.machine_id;
	}

}
