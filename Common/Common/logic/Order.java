package logic;

import java.io.Serializable;
import java.sql.Date;

public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	private int order_num, customer_id, price, machine_id;
	private String order_status, location, items_in_order, supply_method;
	private Date order_created, confirmation_date;
	
	public Order() { }

	public Order(int order_num, int customer_id, int price, String order_status, String location, String items_in_order,
			String supply_method, Date order_created, Date confirmation_date, int machine_id) {
		super();
		this.order_num = order_num;
		this.customer_id = customer_id;
		this.price = price;
		this.order_status = order_status;
		this.location = location;
		this.items_in_order = items_in_order;
		this.supply_method = supply_method;
		this.order_created = order_created;
		this.confirmation_date = confirmation_date;
		this.machine_id = machine_id;
	}

	public int getOrder_num() {
		return order_num;
	}

	public void setOrder_num(int order_num) {
		this.order_num = order_num;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getItems_in_order() {
		return items_in_order;
	}

	public void setItems_in_order(String items_in_order) {
		this.items_in_order = items_in_order;
	}

	public String getSupply_method() {
		return supply_method;
	}

	public void setSupply_method(String supply_method) {
		this.supply_method = supply_method;
	}

	public Date getOrder_created() {
		return order_created;
	}

	public void setOrder_created(Date order_created) {
		this.order_created = order_created;
	}

	public Date getConfirmation_date() {
		return confirmation_date;
	}

	public void setConfirmation_date(Date confirmation_date) {
		this.confirmation_date = confirmation_date;
	}

	public void setMachine_id(int machine_id) {
		this.machine_id = machine_id;
	}
	
	public int getMachine_id() {
		return this.machine_id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Order temp;
		if (obj == null)
			return false;
		
		if (obj.getClass() == this.getClass()) {
			temp = (Order)obj;
			if (temp.getOrder_num() == this.getOrder_num() && temp.getItems_in_order().equals(this.getItems_in_order())
					&& temp.getCustomer_id() == this.getCustomer_id())
				return true;
		}
		
		return false;
	}
}
