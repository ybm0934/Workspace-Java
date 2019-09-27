package Lecture_Answer;

public class Array1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] baseArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int temp;
		
//-- �ǽ� 2 ------------------------------------------------------------		
		int [] array1 = new int[ baseArray.length ]; 
		System.arraycopy( baseArray, 0, array1, 0, baseArray.length );
		
		System.out.println( "2. 1���� �迭 �ʱ� ���\r\n" + 
				"   1  2  3  4  5  6  7  8  9  10\r\n" + 
				"   1���� �迭 ������ �Ʒ��� ���� ������ �� ���\r\n" + 
				"   2  1  4  3  6  5  8  7  10  9\n" );
		for ( int value : array1 ) {
			System.out.printf( "%3d", value );
		}
		System.out.println();
		for ( int i = 0; i < array1.length; i+=2 ) {
			temp = array1[ i ];
			array1[ i ] = array1[ i + 1 ];
			array1[ i + 1 ] = temp;
		}
		for ( int value : array1 ) {
			System.out.printf( "%3d", value );
		}
		System.out.println( "\n" );

//-- �ǽ� 3 ------------------------------------------------------------		
		int [] array2 = new int[ baseArray.length ]; 
		System.arraycopy( baseArray, 0, array2, 0, baseArray.length );
		
		System.out.println( "3. 1���� �迭 �ʱ� ���\r\n" + 
				"   1  2  3  4  5  6  7  8  9  10\r\n" + 
				"   1���� �迭 ������ �Ʒ��� ���� ������ �� ���\r\n" + 
				"   6  7  8  9  10  1  2  3  4  5\n" );
		for ( int value : array2 ) {
			System.out.printf( "%3d", value );
		}
		System.out.println();
		
		int middle = array2.length / 2;
		final int INTERVAL = middle;
		for ( int i = 0; i < middle; ++i ) {
			temp = array2[ i ];
			array2[ i ] = array2[ i + INTERVAL ];
			array2[ i + INTERVAL ] = temp;
		}
		for ( int value : array2 ) {
			System.out.printf( "%3d", value );
		}
		System.out.println( "\n" );

//-- �ǽ� 4 ------------------------------------------------------------
		int [] array3 = new int[] { 1, 2, 3, 4 };
		
		System.out.println( "4. 1���� �迭 �ʱ� ���\r\n" + 
				"   1  2  3  4\r\n" + 
				"   ������ ���� ����Ѵ�.\r\n" + 
				"   1  2  3  4\r\n" + 
				"   2  3  4  1\r\n" + 
				"   3  4  1  2\r\n" + 
				"   4  1  2  3\n" );
		final int MAX_LOOP = array3.length - 1;
		for ( int i = 0; i < array3.length; ++i ) {
			for ( int value : array3 ) {
				System.out.printf( "%3d", value );
			}
			temp = array3[ 0 ];
			for ( int j = 0; j < MAX_LOOP; ++j ) {
				array3[ j ] = array3[ j + 1 ];
			}
			array3[ array3.length - 1 ] = temp;
			System.out.println();
		}		
	}

}
