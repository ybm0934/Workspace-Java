package MVC_SalesFramework;

public class Item {
	public static int LOW_PRICE = 0;
	public static int LOW_QUANTITY = 1;
	
	private String itemName;
	private int price;
	private int quantity;
	private int amount;
	
	public Item( String itemName, int price ) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = 0;
		this.amount = 0;
	}
	
	public String getItemName() {
		return itemName;
	}

	public int getAmount() {
		return amount;
	}

	public void setQuantity(int quantity) {
		this.quantity += quantity;
		calcAmount();
	}

	private void calcAmount() {
		this.amount = this.price * this.quantity;
	}
	
	public String toString() {
		StringBuffer str = new StringBuffer();
		
		str.append( String.format( "%-20s  %6d\t %3d \t\t%8d", itemName, price, quantity, amount ) );
		
		return str.toString();
	}
}
