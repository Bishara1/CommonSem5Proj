package logic;

import java.io.Serializable;

public class Items  implements Serializable{

	private static final long serialVersionUID = 1L;
	private String productID ;
	private String amount;
	private String price;
	
	public Items(String productID, String amount, String price) {
		this.productID = productID;
		this.amount = amount;
		this.price = price;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Items [productID=" + productID + ", Amount=" + amount + ", Price=" + price + "]";
	}
	
	
}
