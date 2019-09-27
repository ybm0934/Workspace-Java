package Homework;

import java.util.Scanner;

public class No_3_Answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int MAX_STUDENT = 10;
		final int MAX_SCORE = 10;
		final int SCORE = 10;

		int[] scores = new int[MAX_SCORE];
		String[] titles = new String[] { " 0 ~   9 : ", "10 ~  19 : ", "20 ~  29 : ", "30 ~  39 : ", "40 ~  49 : ",
				"50 ~  59 : ", "60 ~  69 : ", "70 ~  79 : ", "80 ~  89 : ", "90 ~ 100 : " };
		int number;
		int index;

		System.out.println("5. 20명의 학생 성적을 입력받아 다음과 같은 결과 출력 프로그램\r\n" + "   0 ~   9 : x 명\r\n"
				+ "  10 ~  19 : x 명 \r\n" + "  20 ~  29 : x 명\r\n" + "  30 ~  39 : x 명\r\n" + "  40 ~  49 : x 명\r\n"
				+ "  50 ~  59 : x 명\r\n" + "  60 ~  69 : x 명\r\n" + "  70 ~  79 : x 명\r\n" + "  80 ~  89 : x 명\r\n"
				+ "  90 ~ 100 : x 명\n");
		for (int i = 0; i < MAX_STUDENT; ++i) {
			System.out.printf("[ %2d ]번째 학생 성적 입력 : ", i + 1);
			number = Integer.parseInt(sc.nextLine());
			index = number / SCORE;
			++scores[(index == 10) ? 9 : index];
		}

		System.out.println();
		for (int i = 0; i < MAX_SCORE; ++i) {
			System.out.printf("%11s %2d 명\n", titles[i], scores[i]);
		}
		System.out.println("\n");

	}

}
