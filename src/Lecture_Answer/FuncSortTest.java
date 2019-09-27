package Lecture_Answer;

public class FuncSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sort_numbers = new int[] { 5, 3, 1, 4, 2 };

		System.out.println( "1. ������ ���� ������ �����Ͽ� ���� ������ ū �� ������ ����ϴ� \r\n" + 
				"   ���α׷�( selection sort algorithm )\r\n" + 
				"   Sort �Լ� ����\r\n" + 
				"\r\n" + 
				"   �ʱⰪ : 5 3 1 4 2\r\n" + 
				"   1 step : 1 5 3 4 2\r\n" + 
				"   2 step : 1 2 5 4 3\r\n" + 
				"   3 step : 1 2 3 5 4\r\n" + 
				"   4 step : 1 2 3 4 5\n" );
		printArray( sort_numbers, "�ʱⰪ : " );	
		selectionSort( sort_numbers );
		printArray( sort_numbers, "final  : " );
	}

	public static void printArray( int[] array, String title ) {
		System.out.print( "\n"+ title );
		for ( int value : array ) {
			System.out.printf( "%5d", value );
		}
		System.out.println( "\n" );
	}
	
 	public static void selectionSort( int[] array ) {
 		int max_step = array.length - 1;
		int temp;
		
 		for ( int i = 0; i < max_step; ++i ) {
			for ( int j = i + 1; j < array.length; ++j ) {
				if ( array[ i ] > array[ j ] ) {
					temp = array[ i ];
					array[ i ] = array[ j ];
					array[ j ] = temp;
				}				
			}
			System.out.print( ( i + 1 ) + "step  : " );
			for ( int value : array ) {
				System.out.printf( "%5d", value );
			}
			System.out.println();
		}
 		
 		return;
 	}
}
