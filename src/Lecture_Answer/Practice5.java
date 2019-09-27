package Lecture_Answer;
import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in );
		final int MAX = 10;
		
		int number;
		
		int maxNumber, minNumber;
		
		System.out.print( "1��° ���� �Է� : " );
		number = Integer.parseInt( sc.nextLine() );
		maxNumber = number;
		minNumber = number;
		
		for ( int i = 2; i <= MAX; ++i ) {
			System.out.print( i + "��° ���� �Է� : " );
			number = Integer.parseInt( sc.nextLine() );
			
			if ( number > maxNumber ) {
				maxNumber = number;
			}
			
			if ( number < minNumber ) {
				minNumber = number;
			}
		}
		System.out.println( "\nmaximum number : " + maxNumber );
		System.out.println( "minimum number : " + minNumber );
	}

}
