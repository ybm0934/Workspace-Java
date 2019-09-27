package Lecture_Answer;
import java.util.Scanner;

public class FuncSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_SEARCH_NUMBERS = 10;
		int[] search_numbers = new int[ MAX_SEARCH_NUMBERS ];
		
		System.out.println( "2. 10���� ������ �Է� �޾� 1���� �迭�� ���� �� �� 0�� �Էµ� ������\r\n" + 
				"   ������ �Է¹޾� 10���� ������ �����ϰ� �ִ� 1���� �迭���� �˻���\r\n" + 
				"   �����Ͽ� ã������ �ش� data�� index�� ����ϰ� �˻��� �����ϸ�\r\n" + 
				"   ���� �޽��� ����ϴ� ���α׷�( linear search algorithm )\r\n" + 
				"   �Է� �Լ�, Search �Լ� ����\n" );
		
		inputData( search_numbers, MAX_SEARCH_NUMBERS );
		searchData( search_numbers, MAX_SEARCH_NUMBERS );
	}
	
	public static void inputData( int[] array, final int MAX ) {
		Scanner sc = new Scanner( System.in );
		
		for ( int i = 0; i < MAX; ++i ) {
			System.out.printf( "[ %2d ]��° ���� �Է� : ", i + 1 );
			array[ i ] = Integer.parseInt( sc.nextLine() );
		}
		
	}

	public static void searchData( int[] array, final int MAX ) {
		Scanner sc = new Scanner( System.in );
		
		int searchNumber;
		int index;
		
		System.out.print( "\n�˻��� ������ �Է� �ϼ��� ( 0�̸� ���� ) : " );
		searchNumber = Integer.parseInt( sc.nextLine() );
		while ( searchNumber != 0 ) {
			index = linearSearch( array, searchNumber, MAX );
			if ( index != -1 ) {
				System.out.printf( "���� [ %10d ]�� �迭�� index [ %2d ]�� �ֽ��ϴ�.\n", 
								   searchNumber, index );
			} else {
				System.out.printf( "���� [ %10d ]�� �迭�� �������� �ʽ��ϴ�.\n", searchNumber );
			}
			
			System.out.print( "\n�˻��� ������ �Է� �ϼ��� ( 0�̸� ���� ) : " );
			searchNumber = Integer.parseInt( sc.nextLine() );
		}
		
	}
	
	public static int linearSearch( int[] array, int searchKey, final int MAX ) {
		int resultIndex = -1;
		int index = 0;
		
		while ( index < MAX &&
				searchKey != array[ index ] ) {
			++index;
		}
		
		if ( index < MAX &&
			searchKey == array[ index ] ) {
			resultIndex = index; 
		} 
		
		return resultIndex;
	}
}

