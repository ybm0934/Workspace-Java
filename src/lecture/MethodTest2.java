package lecture;

public class MethodTest2 {

	public static void main(String[] args) {

		int[] sort_numbers = new int[] { 5, 3, 1, 4, 2 };

		System.out.println("7. 다음과 같은 과정을 적용하여 작은 수에서 큰 수 순으로 출력하는 \r\n" + "   프로그램( selection sort algorithm )\r\n"
				+ "\r\n" + "   초기값 : 5 3 1 4 2\r\n" + "   1 step : 1 5 3 4 2\r\n" + "   2 step : 1 2 5 4 3\r\n"
				+ "   3 step : 1 2 3 5 4\r\n" + "   4 step : 1 2 3 4 5\n");

		sort(sort_numbers);

	}

	public static void sort(int[] sort_numbers) {

		int max_step = sort_numbers.length - 1;
		int temp;

		System.out.print("초기값 : ");
		for (int value : sort_numbers) {
			System.out.printf("%5d", value);
		}
		System.out.println("\n");

		for (int i = 0; i < max_step; ++i) {
			for (int j = i + 1; j < sort_numbers.length; ++j) {
				if (sort_numbers[i] > sort_numbers[j]) {
					temp = sort_numbers[i];
					sort_numbers[i] = sort_numbers[j];
					sort_numbers[j] = temp;
				}
			}
			System.out.print((i + 1) + "step  : ");
			for (int value : sort_numbers) {
				System.out.printf("%5d", value);
			}
			System.out.println();
		}

		System.out.print("\nfinal  : ");
		for (int value : sort_numbers) {
			System.out.printf("%5d", value);
		}
		System.out.println("\n");
	}

}
