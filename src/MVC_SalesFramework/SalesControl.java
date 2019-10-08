package MVC_SalesFramework;

import java.util.ArrayList;
import java.util.List;

public class SalesControl {
	private List<Sales> saleItems;

	public SalesControl() {
		saleItems = new ArrayList<>();
	}

	public void appendSaleItemInfo(String itemName, int saleQuantity) {
		saleItems.add(new Sales(itemName, saleQuantity));
	}

	public String toString() {
		StringBuffer str = new StringBuffer();

		for (Sales salesItem : saleItems) {
			str.append(salesItem + "\n");
		}

		return str.toString();
	}

}
