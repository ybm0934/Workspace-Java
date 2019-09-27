package Homework;

import java.util.Scanner;

public class No_2 {

	public static void main(String[] args) {
		// 3. 다음과 같이 출력하는 프로그램(10명 이내 이름이 'end'이면 결과 출력, 90이상 Excellent 60이하 Fail)
		// Hong 50 50 50 150 50.0 Fail
		// Kim 90 90 90 270 90.0 Excellent
		// Nam 70 70 70 210 70.0

		final int MAX_STUDENT = 2;
		final int MAX_SUBJECTS = 3;

		String[] names = new String[MAX_STUDENT];
		int[][] scores = new int[MAX_STUDENT][MAX_SUBJECTS];

		int count = 0;

		count = inputStudent(names, scores, MAX_STUDENT, MAX_SUBJECTS);
		calcScore();
		printInfo();

	}// main

	public static int inputStudent(String[] names, int[][] scores, final int MAX_STUDENT, final int MAX_SUBJECTS) {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		System.out.println("10명의 학생의 이름과 점수를 입력하세요.");
		System.out.print((count + 1) + "번째 학생 이름(\'end\' 입력시 종료) : ");
		String name = sc.nextLine();
		while (!name.equals("end")) {
			count++;
			names[count - 1] = name;
			for (int i = 0; i < MAX_SUBJECTS; i++) {
				System.out.print((i + 1) + "번 과목 : ");
				scores[count][i] = Integer.parseInt(sc.nextLine());
			} // for

			
			
			System.out.println();
			System.out.print((count + 1) + "번째 학생 이름(\'end\' 입력시 종료) : ");
			name = sc.nextLine();
		} // while
		
		System.out.println("\n프로그램 종료");
		
		return count;

	}

	public static void calcScore() {

	}

	public static void printInfo() {

	}

}
