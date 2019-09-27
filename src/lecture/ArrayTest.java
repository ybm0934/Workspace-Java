package lecture;

public class ArrayTest {

	public static void main(String[] args) {

		// 배열 선언
		int[] arr = new int[5];

		arr[0] = 10;
		arr[1] = 20;
		arr[4] = 40;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println();
		double[] darr = new double[] { 10.5, 20.9, 5.5, 7.6, 8.6 };
		for (int i = 0; i < darr.length; i++) {
			System.out.println(darr[i]);
		}

		System.out.println();
		for (double value : darr) {
			System.out.printf("%8.2f", value);
		}
		System.out.println("\n");

		int[][] arr2 = new int[][] { { 10, 11, 12, 13, 14 }, { 20, 21, 22, 23, 24 } };

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				System.out.printf("%3d", arr2[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("여기입니다.");
		for (int[] row : arr2) {
			for (int column : row) {
				System.out.printf("%3d", column);
			}
			System.out.println();
		}

		System.out.println();

		int[][][] arr3 = new int[][][] { { { 1, 2 }, { 3, 4 } }, { { 10, 20 }, { 30, 40 } } };
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[0].length; j++) {
				for (int k = 0; k < arr3[0][0].length; k++) {
					System.out.printf("%4d", arr3[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}

		System.out.println();
		int[] a1 = new int[] { 1, 2, 3 };
		int[] a2 = new int[] { 10, 20, 30, 40, 50 };
		int[] a3 = new int[] { 100, 200, 300, 400 };
		int[][] a4 = new int[][] { a1, a2, a3 };

		for (int i = 0; i < a4.length; i++) {
			for (int j = 0; j < a4[i].length; j++) {
				System.out.printf("%5d", a4[i][j]);
			}
			System.out.println();
		}

		int[] a5 = a1;
		System.out.println();
		for (int value : a5) {
			System.out.printf("%5d", value);
		}

		a5[0] = 1000;
		System.out.println();
		for (int value : a1) {
			System.out.printf("%5d", value);
		}

		int[] a6 = new int[a1.length];
		System.out.println();
		for (int i = 0; i < a1.length; i++) {
			a6[i] = a1[i];
			System.out.printf("%5d", a6[i]);
		}
		a6[0] = 100000;
		System.out.println();
		for (int value : a1) {
			System.out.printf("%5d", value);
		}
		System.out.println();
		for (int value : a6) {
			System.out.printf("%5d", value);
		}
	}
}
