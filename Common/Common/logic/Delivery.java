package logic;

import java.io.Serializable;
import java.sql.Date;

public class Delivery implements Serializable {
	private static final long serialVersionUID = 1L;
	int delivery_id, order_id;
	Date shipping_date, estimated_dleivery;
	String status;
	
	public Delivery() {
		
	}
	
	public Delivery(int delivery_id, int order_id, Date shipping_date, Date estimated_dleivery, String status) {
		this.delivery_id = delivery_id;
		this.order_id = order_id;
		this.shipping_date = shipping_date;
		this.estimated_dleivery = estimated_dleivery;
		this.status = status;
	}
	
	public int getDelivery_id() {
		return delivery_id;
	}
	
	public void setDelivery_id(int delivery_id) {
		this.delivery_id = delivery_id;
	}
	
	public int getOrder_id() {
		return order_id;
	}
	
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	
	public Date getShipping_date() {
		return shipping_date;
	}
	
	public void setShipping_date(Date shipping_date) {
		this.shipping_date = shipping_date;
	}
	
	public Date getEstimated_dleivery() {
		return estimated_dleivery;
	}
	
	public void setEstimated_dleivery(Date estimated_dleivery) {
		this.estimated_dleivery = estimated_dleivery;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}
