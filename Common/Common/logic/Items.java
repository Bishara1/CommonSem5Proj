package logic;

import java.io.Serializable;

public class Items  implements Serializable{

	private  String productID ;
	private String Amount;
	private String Price;
	private static final long serialVersionUID = 1L;
	public Items(String productid, String amount, String price) {
		super();
		productID = productid;
		Amount = amount;
		Price = price;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getAmount() {
		return Amount;
	}

	public void setAmount(String amount) {
		Amount = amount;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Items [productID=" + productID + ", Amount=" + Amount + ", Price=" + Price + "]";
	}
	
	
}
