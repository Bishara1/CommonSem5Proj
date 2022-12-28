package logic;

import java.io.Serializable;

public class Item implements Serializable{

	private static final long serialVersionUID = 1L;
	private String productID ;
	private String amount;
	private int price;
	
	public Item(String productID, String amount, int price) {
		this.productID = productID;
		this.amount = amount;
		this.price = price;
	}

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Items [productID=" + productID + ", Amount=" + amount + ", Price=" + price + "]";
	}
	
	
}
