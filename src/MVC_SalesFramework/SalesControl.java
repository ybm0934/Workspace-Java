package MVC_SalesFramework;
import java.util.ArrayList;
import java.util.List;

public class SalesControl {
	private List<Sales> saleItems;
	private int countSales;
	
	public SalesControl() {
		saleItems = new ArrayList<>();
		countSales = 0;
	}
	
	public void appendSaleItemInfo( String itemName, int saleQuantity ) {
		saleItems.add( new Sales( itemName, saleQuantity ) );
	}
	
	public String toString() {
		StringBuffer str = new StringBuffer();
		
		for ( Sales salesItem : saleItems ) {
			str.append( salesItem + "\n" );
		}
		
		return str.toString();
	}
}
