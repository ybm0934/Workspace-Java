package Homework;

import java.util.Scanner;

public class No_1 {

	public static void main(String[] args) {
		// 8. 10개의 정수를 입력 받아 1차원 배열에 저장 한 후 0이 입력될 때까지 정수를 입력받아 10개의 정수를 저장하고 있는 1차원
		// 배열에서 검색을 수행하여 찾았으면 해당 data의 search를 출력하고 검색을 실패하면 에러 메시지 출력하는 프로그램(linear
		// search)	-- Success

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int value;
		int count = 0;
		int i;

		System.out.println("5개의 정수를 입력하세요.");
		System.out.print((count + 1) + "번째 정수 : ");
		value = Integer.parseInt(sc.nextLine());
		while (value != 0) {
			count++;
			arr[count - 1] = value;

			if (count < arr.length) {
				System.out.print((count + 1) + "번째 정수 : ");
				value = Integer.parseInt(sc.nextLine());
				arr[count] = value;
			} else {
				break;
			} // if
		} // while

		System.out.println();
		for (int val : arr) {
			System.out.print(val + "\t");
		}
		System.out.println();

		System.out.print("검색할 정수 : ");
		int index = Integer.parseInt(sc.nextLine());
		while (index != 0) {
			count = 0;

			while (count < arr.length && index != arr[count]) {
				count++;
			}

			if (count < arr.length && index == arr[count]) {
				System.out.println("정수 [ " + index + " ]는 arr[ " + count + " ]에 있습니다.");
			} else {
				System.out.println("결과가 없습니다.");
			}
			
			System.out.print("\n검색할 정수 : ");
			index = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("프로그램 종료");

	}// main

}
