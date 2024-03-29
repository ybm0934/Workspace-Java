package MVC_SalesFramework;

public class Sales {
	// 품목명과 판매수량만을 정의하며, 판매금액을 계산하기 위하여 판매수량을 입력 받는 클래스

	private String itemName; // 품목명
	private int saleQuantity; // 판매수량

	public Sales(String itemName, int saleQuantity) {
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
		
		str.append(String.format("%-20s %6d", itemName, saleQuantity));
		
		return str.toString();
	}

}
