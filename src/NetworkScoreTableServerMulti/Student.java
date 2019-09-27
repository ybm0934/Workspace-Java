package NetworkScoreTableServerMulti;

public class Student {
	public static final int MAX_SUBJECT = 3;
	
	public static final int EXCELLENT = 90;
	public static final int FAIL = 60;
	public static final int HIGH_SCORE = 100;
	public static final int LOW_SCORE = 0;
	
	private String name;
	private int[] subjects = new int[ MAX_SUBJECT ];
	private int total;
	private double average;
	private int rank;
	private String grade;
	
	public Student( String name, int[] subject ) {
		this.name = name;
		
		int i = 0;
		for ( int score : subject ) {
			this.subjects[ i++ ] = score;
		}
		this.total = 0;
		
		calcScore();
		
		this.rank = 1;
	}
	
	public String getName() {
		return name;
	}

	public double getAverage() {
		return average;
	}

	public void setRank(int rank) {
		this.rank = rank;
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
		StringBuffer str = new StringBuffer();
		
		str.append( String.format( "%-10s ", name ) );
		for ( int i = 0; i < MAX_SUBJECT; ++i ) {
			str.append( String.format( "%5d ", subjects[ i ] ) );
		}
		str.append( String.format( " %6d %8.2f   %3d   %-10s", total, average, rank, grade ) );
		
		return str.toString();
	}
}
