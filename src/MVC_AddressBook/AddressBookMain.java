package MVC_AddressBook;
import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_ADDRESS_INFO = 3;
		
		AddressInfo[] addressInfos = new AddressInfo[ MAX_ADDRESS_INFO ];
	
		inputAddressInfo( addressInfos, MAX_ADDRESS_INFO );
		printAddressInfo( addressInfos );
	}
	
	public static void inputAddressInfo( AddressInfo[] addressInfos, final int MAX_ADDRESS_INFO ) {
		Scanner sc = new Scanner( System.in );
		
		String name, tel, email;
		
		for ( int i = 0; i < MAX_ADDRESS_INFO; ++i ) {
			System.out.printf( "[%2d]��° �ּ� ������ �̸� �Է� : ", i + 1 );
			name = sc.nextLine();
			System.out.printf( "[%2d]��° �ּ� ������ ��ȭ��ȣ �Է� : ", i + 1 );
			tel = sc.nextLine();
			System.out.printf( "[%2d]��° �ּ� ������ e-mail �Է� : ", i + 1 );
			email = sc.nextLine();			
			
			addressInfos[ i ] = new AddressInfo( name, tel, email );
			System.out.println();
		}
	}
	
	public static void printAddressInfo( AddressInfo[] addressInfos ) {
		System.out.println();
		for ( AddressInfo addressInfo : addressInfos ) {
			System.out.println( addressInfo );
		}
	}

}
