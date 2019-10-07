package Homework;

import java.util.Scanner;

public class No_3 {

	public static void main(String[] args) {

		// 5. 20명의 학생 성적을 입력받아 다음과 같은 결과 출력 프로그램(결과 : 인원수 결과가 1차원 배열)
		// 0 ~ 9 : x 명
		// 10 ~ 19 : x 명
		// 20 ~ 29 : x 명
		// 30 ~ 39 : x 명
		// 40 ~ 49 : x 명
		// 50 ~ 59 : x 명
		// 60 ~ 69 : x 명
		// 70 ~ 79 : x 명
		// 80 ~ 89 : x 명
		// 90 ~ 100 : x 명
		//--Success

		Scanner sc = new Scanner(System.in);

		final int MAX_STUDENT = 5;
		final int MAX_COUNT = 10;

		int[] arr = new int[MAX_STUDENT];
		int[] cnt = new int[MAX_COUNT];
		String[] title = new String[] { "0 ~ 9 : ", "10 ~ 19 : ", "20 ~ 29 : ", "30 ~ 39 : ", "40 ~ 49 : ",
				"50 ~ 59 : ", "60 ~ 69 : ", "70 ~ 79 : ", "80 ~ 89 : ", "90 ~ 100 : " };

		System.out.println(MAX_STUDENT + "명의 성적을 입력하세요.");
		for (int i = 0; i < MAX_STUDENT; i++) {
			System.out.print((i + 1) + "번 학생 성적 : ");
			arr[i] = Integer.parseInt(sc.nextLine());
			int score = arr[i] / MAX_COUNT;
			cnt[(score == 10) ? 9 : score]++;
		}

		System.out.println();
		for (int i = 0; i < MAX_COUNT; i++) {
			System.out.println(title[i] + cnt[i] + " 명");
		}

	}// main

}// class
