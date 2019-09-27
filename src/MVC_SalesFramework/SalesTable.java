package MVC_SalesFramework;
import java.util.ArrayList;
import java.util.List;

public class SalesTable {
	private ItemControl itemControl;
	private SalesControl salesControl;
	
	public SalesTable() {
		itemControl = new ItemControl();
		salesControl = new SalesControl();
	}

	public ItemControl getItemControl() {
		return itemControl;
	}

	public SalesControl getSalesControl() {
		return salesControl;
	}

	public void appendItemInfo( String itemName, int price ) {
		itemControl.appendItemInfo( itemName, price );
	}
	
	public void appendSaleInfo( String itemName, int saleQuantity ) {
		salesControl.appendSaleItemInfo( itemName, saleQuantity );
		itemControl.setSaleQuantity( itemName, saleQuantity );
	}
	
	public int searchItemInfo( String itemName ) {
		return itemControl.searchItem( itemName ); 
	}
	
	public void printSalesTableItemName() {
		Item[] itemArray = copyArray();
		final int MAX_ARRAY = itemArray.length - 1;
		
		Item temp;
		int k;
		for ( int i = 0; i < MAX_ARRAY; ++i ) {
			k = i;
			for ( int j = i + 1; j < itemArray.length; ++j ) {
				if ( itemArray[ k ].getItemName().compareTo( itemArray[ j ].getItemName() ) > 0 ) {
					k = j;
				}
			}
			if ( k != i ) {
				temp = itemArray[ i ];
				itemArray[ i ] = itemArray[ k ];
				itemArray[ k ] = temp;
			}
		}
		this.changeItemArray( itemArray );
		System.out.print( itemControl );
	}
	
	public void printSalesTableAmount() {
		Item[] itemArray = copyArray();
		final int MAX_ARRAY = itemArray.length - 1;
		
		Item temp;
		int k;
		for ( int i = 0; i < MAX_ARRAY; ++i ) {
			k = i;
			for ( int j = i + 1; j < itemArray.length; ++j ) {
				if ( itemArray[ k ].getAmount() < itemArray[ j ].getAmount() ) {
					k = j;
				}
			}
			if ( k != i ) {
				temp = itemArray[ i ];
				itemArray[ i ] = itemArray[ k ];
				itemArray[ k ] = temp;
			}
		}
		this.changeItemArray( itemArray );	
		System.out.print( itemControl );
	}

	private Item[] copyArray() {
		final int MAX_ITEM = itemControl.getCountItem();
		List<Item> items = itemControl.getItems();
		Item[] itemArray = new Item[ MAX_ITEM ];
		
		for ( int i = 0; i < MAX_ITEM; ++i ) {
			itemArray[ i ] = items.get( i ); 
		}

		return itemArray;
	}

	private void changeItemArray( Item[] itemArray ) {
		List<Item> items = new ArrayList<>();
		
		for ( Item item : itemArray ) {
			items.add( item );
		}
		
		itemControl.setItems( items );
	}
	
}
