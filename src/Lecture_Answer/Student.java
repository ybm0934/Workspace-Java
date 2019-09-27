package Lecture_Answer;

public class Student {
	public static final int MAX_SUBJECT = 3;
	
	public static final int EXCELLENT = 90;
	public static final int FAIL = 60;
	
	private String name;
	private int[] subjects = new int[ MAX_SUBJECT ];
	private int total;
	private double average;
	private String grade;
	
	public Student( String name, int[] subject ) {
		this.name = name;
		
		int i = 0;
		for ( int score : subject ) {
			this.subjects[ i++ ] = score;
		}
		this.total = 0;
		
		calcScore();
	}
	
	
	public double getAverage() {
		return average;
	}

	private void calcScore() {
		for ( int score : subjects ) {
			total += score;
		}
		
		average = total / (double)MAX_SUBJECT;
		
		if ( average >= EXCELLENT ) {
			grade = "Excellent";
		} else if ( average < FAIL ) {
			grade = "Fail";
		} else {
			grade = "";
		}
	}
	
	public String toString() {
		String str;
		
		str = String.format( "%-10s ", name );
		for ( int i = 0; i < MAX_SUBJECT; ++i ) {
			str += String.format( "%5d ", subjects[ i ] );
		}
		str += String.format( " %6d %8.2f %-10s", total, average, grade );
		
		return str;
	}
}
