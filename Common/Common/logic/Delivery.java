package logic;

import java.io.Serializable;
import java.sql.Date;

public class Delivery implements Serializable {
	private static final long serialVersionUID = 1L;
	int delivery_id, order_id, customer_id, total_price;
	Date shipping_date, estimated_delivery;
	String status, location;
	
	public Delivery() { }
	
	public Delivery(int delivery_id, int order_id, int customer_id, Date shipping_date, Date estimated_delivery, String status, int total_price, String location) {
		this.delivery_id = delivery_id;
		this.order_id = order_id;
		this.customer_id = customer_id;
		this.shipping_date = shipping_date;
		this.estimated_delivery = estimated_delivery;
		this.status = status;
		this.total_price = total_price;
		this.location = location;
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

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

	public Date getShipping_date() {
		return shipping_date;
	}

	public void setShipping_date(Date shipping_date) {
		this.shipping_date = shipping_date;
	}

	public Date getEstimated_Delivery() {
		return estimated_delivery;
	}

	public void setEstimated_Delivery(Date estimated_dleivery) {
		this.estimated_delivery = estimated_dleivery;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public boolean equals(Object obj) {
		Delivery temp;
		if (obj == null)
			return false;
		
		if (obj.getClass() == this.getClass()) {
			temp = (Delivery)obj;
			if (temp.getDelivery_id() == this.getDelivery_id())
				return true;
		}
		
		return false;
	}
}
