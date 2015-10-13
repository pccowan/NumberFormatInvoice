package invoiceData;

public class Item {
	private String name;
	private String description;
	private double price;
	private String invNum;
	private double qty;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInvNum() {
		return invNum;
	}

	public void setInvNum(String invNum) {
		this.invNum = invNum;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQty() {
		return qty;
	}

	public void setQty(double qty) {
		this.qty = qty;
	}

	public Item(String itemName, String itemDescription, Double itemPrice,
			String itemInvNum, Double quantity) {
		name = itemName;
		description = itemDescription;
		price = itemPrice;
		invNum = itemInvNum;
		qty = quantity;
	}

	double subtotal = 0.0;

	public double getSubtotal(Double qty) {

		if (qty > 1) {
			price = price * qty;
			subtotal = price;
		}else if (qty == 1) {
			return subtotal = price;
		}
				
		return price;

	}
}
