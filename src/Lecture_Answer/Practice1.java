package Lecture_Answer;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in );
		
		int number1, number2, number3;
		int max = 0, mid = 0, min = 0;
		
		System.out.print( "Input number1 : " );
		number1 = Integer.parseInt( sc.nextLine() );
		while ( number1 != 0 ) {
			System.out.print( "Input number2 : " );
			number2 = Integer.parseInt( sc.nextLine() );
			
			System.out.print( "Input number3 : " );
			number3 = Integer.parseInt( sc.nextLine() );
			
			if ( number1 != number2 && 
				 number1 != number3 && 
				 number2 != number3 ) {
				if ( number1 > number2 ) {
					if ( number1 > number3 ) {
						max = number1;
						if ( number2 > number3 ) {
							mid = number2;
							min = number3;
						} else {
							mid = number3;
							min = number2;
						}
					}  else {
						max = number3;
						mid = number1;
						min = number2;
					}
				} else if ( number2 > number3 ) {
					max = number2;
					if ( number1 > number3 ) {
						mid = number1;
						min = number3;
					} else {
						mid = number3;
						min = number1;
					}
				} else {
					max = number3;
					mid = number2;
					min = number1;
				}
				System.out.println( "\nmax = " + max + "\nmid = " + mid + "\nmin = " + min );
			} else {
				System.out.println( "error : " + number1 + "==" + number2 + "==" + number3 );
			}
			
			System.out.print( "\nInput number1 : " );
			number1 = Integer.parseInt( sc.nextLine() );
		}
	}

}
