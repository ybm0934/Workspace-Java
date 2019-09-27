package MVC_SalesFramework;
import java.util.Scanner;

public class SalesTableUI {
	private SalesTable salesTable;
	
	public SalesTableUI() {
		salesTable = new SalesTable();
	}
	
	public void mainMenu() {
		String menu = "   <<< �Ǹ� ���� >>>\n\n"
					+ "1. ǰ�� ���� ���\n"
				    + "2. �Ǹ� ���� ���\n"
				    + "3. �Ǹ� �϶�ǥ ���( ǰ���� )\n"
				    + "4. �Ǹ� �϶�ǥ ���( �Ǹűݾ׼� )\n"				    
				    + "0. ����\n"
				    + "���ϴ� �޴��� �����ϼ���... ";
		Scanner sc = new Scanner( System.in );
		int select = -1;
		while ( select != 0 ) {
			System.out.print( menu );
			select = Integer.parseInt( sc.nextLine() );
			switch ( select ) {
			case 1: inputItemInfo();		break;
			case 2: inputSaleInfo();		break;
			case 3: printSaleTableItem();	break;
			case 4: printSaleTableAmount();	break;
			case 0: 						break;
			default: System.out.println( "Error : 0 ~ 4���̸� �Է� ����...\n" );
			}
		} 
		System.out.println( "\nStop program.....\n" );
	}
	
	public void inputItemInfo() {
		Scanner sc = new Scanner( System.in );
		
		String itemName;
		int price;

		System.out.print( "\nǰ��� �Է� ( \'end\'�� ���� ) : " );
		itemName = sc.nextLine();
		while ( !itemName.equals( "end" ) ) {
			System.out.printf( "[ %-20s ] �ܰ� �Է� : ", itemName );
			price = Integer.parseInt( sc.nextLine() );
			while ( price < Item.LOW_PRICE ) {
				System.out.printf( "\tError : �ܰ��� 0�̻� �Է� �ϼ���.\n\n" );
				System.out.printf( "[ %-20s ] �ܰ� �Է� : ", itemName );
				price = Integer.parseInt( sc.nextLine() );
			}
			
			salesTable.appendItemInfo( itemName, price );
			
			System.out.print( "\nǰ��� �Է� ( \'end\'�� ���� ) : " );
			itemName = sc.nextLine();
		}
	}
	
	public void inputSaleInfo() {
		Scanner sc = new Scanner( System.in );
		
		String itemName;
		int saleQuantity;
		int index;

		System.out.print( "\nǰ��� �Է� ( \'end\'�� ���� ) : " );
		itemName = sc.nextLine();
		while ( !itemName.equals( "end" ) ) {
			index = salesTable.searchItemInfo( itemName );
			while ( index < 0 ) {
				System.out.printf( "\tError : [ %-20s ]�� ��ϵǾ� ���� �ʽ��ϴ�.\n"
						+ "\t        ǰ������ ����� �Ǹ� ������ ����ϼ���.\n", itemName );
				System.out.print( "\nǰ��� �Է� ( \'end\'�� ���� ) : " );
				itemName = sc.nextLine();
				if ( !itemName.equals( "end" ) ) {
					index = salesTable.searchItemInfo( itemName );
				} else {
					break;
				}
			}
			
			if ( !itemName.equals( "end" ) ) {
				System.out.printf( "[ %-20s ]�� �Ǹ� ���� �Է� : ", itemName );
				saleQuantity = Integer.parseInt( sc.nextLine() );
				while ( saleQuantity < Item.LOW_QUANTITY ) {
					System.out.printf( "\tError : �Ǹ� ������ 1 �̻� �Է� �ϼ���.\n\n" );
					System.out.printf( "[ %-20s ]�� �Ǹ� ���� �Է� : ", itemName );
					saleQuantity = Integer.parseInt( sc.nextLine() );
				}
				
				salesTable.appendSaleInfo( itemName, saleQuantity );
				
				System.out.println();
				System.out.print( salesTable.getSalesControl() );
				System.out.println();
				
				System.out.print( "\nǰ��� �Է� ( \'end\'�� ���� ) : " );
				itemName = sc.nextLine();
			} else {
				break;
			}
		}		
	}
	
	public void printSaleTableItem() {
		System.out.println();
		System.out.println( "\t  <<< �Ǹ� �϶�ǥ(ǰ���) >>>" );
		System.out.println();
		System.out.println( "--------------------------------------------------------" );
		System.out.println( "ǰ���\t\t\t�ܰ�\t�Ǹż���\t�Ǹűݾ�" );
		System.out.println( "--------------------------------------------------------" );
		salesTable.printSalesTableItemName();
		System.out.println( "--------------------------------------------------------" );
		System.out.printf( "\t\t\t\t   ���Ǹűݾ� : %8d\n", salesTable.getItemControl().getTotalAmount() );
		System.out.println();
	}
	
	public void printSaleTableAmount() {
		System.out.println();
		System.out.println( "\t  <<< �Ǹ� �϶�ǥ(�Ǹűݾ׼�) >>>" );
		System.out.println();
		System.out.println( "--------------------------------------------------------" );
		System.out.println( "ǰ���\t\t\t�ܰ�\t�Ǹż���\t�Ǹűݾ�" );
		System.out.println( "--------------------------------------------------------" );	
		salesTable.printSalesTableAmount();
		System.out.println( "--------------------------------------------------------" );
		System.out.printf( "\t\t\t\t   ���Ǹűݾ� : %8d\n", salesTable.getItemControl().getTotalAmount() );
		System.out.println();		
	}
}
