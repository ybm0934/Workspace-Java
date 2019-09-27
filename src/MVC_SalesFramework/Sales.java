package MVC_SalesFramework;

public class Sales {
	private static int countItem = 0;
	
	private int number;
	private String itemName;
	private int saleQuantity;
	
	private static int calcCountItem() {
		++countItem;
		
		return countItem;
	}
	
	public Sales( String itemName, int saleQuantity ) {
		number = calcCountItem();
		this.itemName = itemName;
		this.saleQuantity = saleQuantity;
	}
	
	
	public String getItemName() {
		return itemName;
	}

	public int getSaleQuantity() {
		return saleQuantity;
	}

	public String toString() {
		StringBuffer str = new StringBuffer();
		
		str.append( String.format( "[%5d] %-20s %6d", number, itemName, saleQuantity ) );
		
		return str.toString();
	}
	
}
