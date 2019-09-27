package Lecture_Answer;
import java.util.Scanner;

public class Array1Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in );
		
//-- �ǽ� 5 ------------------------------------------------------------
		final int MAX_STUDENT = 10;
		final int MAX_SCORE = 10;
		final int SCORE = 10;
		
		int[] scores = new int[ MAX_SCORE ];
		String[] titles = new String[] { " 0 ~   9 : ", "10 ~  19 : ",
										 "20 ~  29 : ", "30 ~  39 : ",
										 "40 ~  49 : ", "50 ~  59 : ",
										 "60 ~  69 : ", "70 ~  79 : ",
										 "80 ~  89 : ", "90 ~ 100 : "
										 };
		int number; 
		int index;
		
		System.out.println( "5. 20���� �л� ������ �Է¹޾� ������ ���� ��� ��� ���α׷�\r\n" + 
				"   0 ~   9 : x ��\r\n" + 
				"  10 ~  19 : x �� \r\n" + 
				"  20 ~  29 : x ��\r\n" + 
				"  30 ~  39 : x ��\r\n" + 
				"  40 ~  49 : x ��\r\n" + 
				"  50 ~  59 : x ��\r\n" + 
				"  60 ~  69 : x ��\r\n" + 
				"  70 ~  79 : x ��\r\n" + 
				"  80 ~  89 : x ��\r\n" + 
				"  90 ~ 100 : x ��\n" );
		for ( int i = 0; i < MAX_STUDENT; ++i ) {
			System.out.printf( "[ %2d ]��° �л� ���� �Է� : ", i + 1 );
			number = Integer.parseInt( sc.nextLine() );
			index = number / SCORE;
			++scores[ ( index == 10 ) ? 9 : index ];
		}
		
		System.out.println();
		for ( int i = 0; i < MAX_SCORE; ++i ) {
			System.out.printf( "%11s %2d ��\n", titles[ i ], scores[ i ] );
		}
		System.out.println( "\n" );

//-- �ǽ� 6 ------------------------------------------------------------
		final int MAX_INT = 10;
		
		int[] numbers = new int[ MAX_INT ];
		int maxNumber, minNumber;
		
		System.out.println( "6. 10���� ������ �Է¹޾� 1���� �迭�� ������ �� ���� ū ����\r\n" + 
				"   ���� ���� ���� ã�Ƽ� ����ϴ� ���α׷�\n" );
		
		for ( int i = 0; i < MAX_INT; ++i ) {
			System.out.printf( "[ %2d ]��° ���� �Է� : ", i + 1 );
			numbers[ i ] = Integer.parseInt( sc.nextLine() );
		}
		
		maxNumber = numbers[ 0 ];
		minNumber = numbers[ 0 ];
		
		for ( int i = 1; i < MAX_INT; ++i ) {
			if ( numbers[ i ] > maxNumber ) {
				maxNumber = numbers[ i ];
			}

			if ( numbers[ i ] < minNumber ) {
				minNumber = numbers[ i ];
			}
		}
		System.out.printf( "\nMax Number : %d\nMin Number : %d\n\n", 
						   maxNumber, minNumber );

//-- �ǽ� 7 ------------------------------------------------------------
		int[] sort_numbers = new int[] { 5, 3, 1, 4, 2 };
		int max_step = sort_numbers.length - 1;
		int temp;

		System.out.println( "7. ������ ���� ������ �����Ͽ� ���� ������ ū �� ������ ����ϴ� \r\n" + 
				"   ���α׷�( selection sort algorithm )\r\n" + 
				"\r\n" + 
				"   �ʱⰪ : 5 3 1 4 2\r\n" + 
				"   1 step : 1 5 3 4 2\r\n" + 
				"   2 step : 1 2 5 4 3\r\n" + 
				"   3 step : 1 2 3 5 4\r\n" + 
				"   4 step : 1 2 3 4 5\n" );
		
		System.out.print( "�ʱⰪ : " );
		for ( int value : sort_numbers ) {
			System.out.printf( "%5d", value );
		}
		System.out.println( "\n" );
		
		for ( int i = 0; i < max_step; ++i ) {
			for ( int j = i + 1; j < sort_numbers.length; ++j ) {
				if ( sort_numbers[ i ] > sort_numbers[ j ] ) {
					temp = sort_numbers[ i ];
					sort_numbers[ i ] = sort_numbers[ j ];
					sort_numbers[ j ] = temp;
				}				
			}
			System.out.print( ( i + 1 ) + "step  : " );
			for ( int value : sort_numbers ) {
				System.out.printf( "%5d", value );
			}
			System.out.println();
		}

		System.out.print( "\nfinal  : " );
		for ( int value : sort_numbers ) {
			System.out.printf( "%5d", value );
		}
		System.out.println( "\n" );

//-- �ǽ� 8 ------------------------------------------------------------
		final int MAX_SEARCH_NUMBERS = 10;
		int[] search_numbers = new int[ MAX_SEARCH_NUMBERS ];
		
		int searchNumber;
		
		System.out.println( "8. 10���� ������ �Է� �޾� 1���� �迭�� ���� �� �� 0�� �Էµ� ������\r\n" + 
				"   ������ �Է¹޾� 10���� ������ �����ϰ� �ִ� 1���� �迭���� �˻���\r\n" + 
				"   �����Ͽ� ã������ �ش� data�� index�� ����ϰ� �˻��� �����ϸ�\r\n" + 
				"   ���� �޽��� ����ϴ� ���α׷�( linear search algorithm )\n" );
		
		for ( int i = 0; i < MAX_SEARCH_NUMBERS; ++i ) {
			System.out.printf( "[ %2d ]��° ���� �Է� : ", i + 1 );
			search_numbers[ i ] = Integer.parseInt( sc.nextLine() );
		}
		
		System.out.print( "\n�˻��� ������ �Է� �ϼ��� ( 0�̸� ���� ) : " );
		searchNumber = Integer.parseInt( sc.nextLine() );
		while ( searchNumber != 0 ) {
			index = 0;
			while ( index < MAX_SEARCH_NUMBERS &&
					searchNumber != search_numbers[ index ] ) {
				++index;
			}
			
			if ( index < MAX_SEARCH_NUMBERS &&
				 searchNumber == search_numbers[ index ] ) {
				System.out.printf( "���� [ %10d ]�� �迭�� index [ %2d ]�� �ֽ��ϴ�.\n", 
								   searchNumber, index );
			} else {
				System.out.printf( "���� [ %10d ]�� �迭�� �������� �ʽ��ϴ�.\n", searchNumber );
			}
			
			System.out.print( "\n�˻��� ������ �Է� �ϼ��� ( 0�̸� ���� ) : " );
			searchNumber = Integer.parseInt( sc.nextLine() );
		}
	}

}
