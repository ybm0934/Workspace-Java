package Lecture_Answer;
import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in );
		final int MULTIPLE_MAX = 9;
		
		int number;
		int multiple;
		
		System.out.print( "������ ����� ���ϴ� ���� �Է� ( 0 : quit ) : " );
		number = Integer.parseInt( sc.nextLine() );
		while ( number != 0 ) {
			System.out.println();
			for ( int i = 1; i <= MULTIPLE_MAX; ++i ) {
				multiple = number * i;
				System.out.println( number + " X " + i + " = " + multiple );
			}
			System.out.print( "\n������ ����� ���ϴ� ���� �Է� ( 0 : quit ) : " );
			number = Integer.parseInt( sc.nextLine() );
		}
	}

}
