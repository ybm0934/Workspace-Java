package Lecture_Answer;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in );
		
		final int MAX = 10;
		final int EVEN_ODD = 2;
		
		int number;
		int positive = 0, negative = 0, even = 0, odd = 0, error = 0;
		int remain;
		
		for ( int i = 1; i <= MAX; ++i ) {
			System.out.print( "Input integer number [ " + i + " ] : " );
			number = Integer.parseInt( sc.nextLine() );
			if ( number != 0 ) {
				if ( number > 0 ) {
					++positive;
					remain = number % 2;
					if ( remain == 0 ) {
						++even;
					} else {
						++odd;
					}
				} else {
					++negative;
				}
			} else {
				++error;
				System.out.println( "\t\tError : zero number" );
			}
		}
		
		System.out.println( "\nPositive count : " + positive );
		System.out.println( "\tEven count : " + even );
		System.out.println( "\tOdd count : " + odd );
		System.out.println( "Negative count : " + negative );
		System.out.println( "\nerror count : " + error );
	}

}
