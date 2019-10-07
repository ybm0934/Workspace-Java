package Homework;

public class No_4 {

	public static void main(String[] args) {
		// 7. 다음과 같은 과정을 적용하여 작은 수에서 큰 수 순으로 출력하는 프로그램(selection sort algorithm)

		// 초기값 : 5 3 1 4 2
		// 1 step : 1 5 3 4 2
		// 2 step : 1 2 5 4 3
		// 3 step : 1 2 3 5 4
		// 4 step : 1 2 3 4 5
		//
		// --Success

		int[] arr = new int[] { 5, 3, 1, 4, 2 };
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print((i + 1) + " step : ");
			for (int val : arr) {
				System.out.print(val + "\t");
			}
			System.out.println();
		}

	}

}
