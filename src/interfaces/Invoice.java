package interfaces;

public class Invoice implements Payable{
	
	private final String partNumber;
	private final String partDescription;
	private int quantity;
	private double price;

	public Invoice(String partNumber, String partDescription, int quantity,
			double price) {
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}

	@Override
	public double getPaymentAmount(){
		return getQuantity() * getPrice();
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
