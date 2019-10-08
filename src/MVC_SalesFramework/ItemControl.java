package MVC_SalesFramework;

import java.util.ArrayList;
import java.util.List;

public class ItemControl {
	private List<Item> items;
	private int countItem;
	private int totalAmount;

	public ItemControl() {
		items = new ArrayList<>();
		countItem = 0;
		totalAmount = 0;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items.clear();
		for (Item item : items) {
			this.items.add(item);
		}
	}
	
	public int getCountItem() {
		return countItem;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void appendItemInfo(String itemName, int price) {
		items.add(new Item(itemName, price));
		countItem++;
	}

	public int searchItem(String itemName) {
		int index = -1;

		for (int i = 0; i < items.size(); i++) {
			if (itemName.equals(items.get(i).getItemName())) {
				index = i;
				break;
			}
		}

		return index;
	}

	public int setSaleQuantity(String itemName, int saleQuantity) {
		int index = searchItem(itemName);

		if (index >= 0) {
			items.get(index).setQuantity(saleQuantity);
			totalAmount += items.get(index).getAmount();
		}

		return index;
	}

	public String toString() {
		StringBuffer str = new StringBuffer();

		for (Item item : items) {
			str.append(item + "\n");
		}

		return str.toString();
	}

}