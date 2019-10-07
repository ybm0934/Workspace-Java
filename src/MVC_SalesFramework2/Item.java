package MVC_SalesFramework2;

public class Item {
	// 품목명, 단가, 판매수량, 판매금액을 총괄하는 클래스

	public static int LOW_PRICE = 0; // 최저 가격
	public static int LOW_QUANTITY = 1; // 최저 수량

	private String itemName; // 품목명
	private int price; // 단가
	private int quantity; // 판매수량
	private int amount; // 판매금액

	public Item(String itemName, int price) {
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
		this.amount = this.price * this.quantity;
	}

	public String toString() {
		StringBuffer str = new StringBuffer();

		str.append(String.format("%-20s %6d\t %3d \t\t%8d", itemName, price, quantity, amount));

		return str.toString();
	}

}
