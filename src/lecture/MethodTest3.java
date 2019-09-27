package lecture;

import java.util.Scanner;

public class MethodTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("8. 10개의 정수를 입력 받아 1차원 배열에 저장 한 후 0이 입력될 때까지\r\n"
				+ "   정수를 입력받아 10개의 정수를 저장하고 있는 1차원 배열에서 검색을\r\n" + "   수행하여 찾았으면 해당 data의 index를 출력하고 검색을 실패하면\r\n"
				+ "   에러 메시지 출력하는 프로그램( linear search algorithm )\n");

		int searchNumber;
		System.out.print("\n검색할 정수를 입력 하세요 ( 0이면 종료 ) : ");
		searchNumber = Integer.parseInt(sc.nextLine());

		search(searchNumber);

	}

	public static void search(int searchNumber) {
		Scanner sc = new Scanner(System.in);
		final int MAX_SEARCH_NUMBERS = 10;
		int[] search_numbers = new int[MAX_SEARCH_NUMBERS];

		for (int i = 0; i < MAX_SEARCH_NUMBERS; ++i) {
			System.out.printf("[ %2d ]번째 정수 입력 : ", i + 1);
			search_numbers[i] = Integer.parseInt(sc.nextLine());
		}

		while (searchNumber != 0) {
			int index = 0;
			while (index < MAX_SEARCH_NUMBERS && searchNumber != search_numbers[index]) {
				++index;
			}

			if (index < MAX_SEARCH_NUMBERS && searchNumber == search_numbers[index]) {
				System.out.printf("정수 [ %10d ]은 배열의 index [ %2d ]에 있습니다.\n", searchNumber, index);
			} else {
				System.out.printf("정수 [ %10d ]은 배열에 존재하지 않습니다.\n", searchNumber);
			}

			System.out.print("\n검색할 정수를 입력 하세요 ( 0이면 종료 ) : ");
			searchNumber = Integer.parseInt(sc.nextLine());
		}
	}

}
