package Lecture_Answer;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX = 10000;
		final int MULTIPLE_3 = 3;
		final int MULTIPLE_5 = 5;
		
		int multipleCount = 0;
		double multipleSum = 0.0;
		int lineCount = 0;
		
		int remain_3, remain_5;
		
		for ( int i = 1; i <= MAX; ++i ) {
			remain_3 = i % MULTIPLE_3;
			remain_5 = i % MULTIPLE_5;
			
			if ( remain_3 == 0 || remain_5 == 0 ) {
				++multipleCount;
				multipleSum += i;
				
				++lineCount;
				//System.out.print( i + " " );
				System.out.printf("%6d", i);
				if ( lineCount == 10 ) {
					lineCount = 0;
					System.out.println();
				}
			}
		}
		System.out.println( "\n\n1 ~ 10000������ 3�� ����� 5�� ����� ���� : " + multipleCount );
		System.out.println( "1 ~ 10000������ 3�� ����� 5�� ����� �� : " + multipleSum );
	}

}
