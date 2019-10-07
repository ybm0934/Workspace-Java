package Homework;

import java.util.Scanner;

public class No_2 {

	public static void main(String[] args) {
		// 3. 다음과 같이 출력하는 프로그램(10명 이내 이름이 'end'이면 결과 출력, 90이상 Excellent 60미만 Fail)
		// Hong 50 50 50 150 50.0 Fail
		// Kim 90 90 90 270 90.0 Excellent
		// Nam 70 70 70 210 70.0
		// --Success

		final int MAX_STUDENT = 4;
		final int MAX_SUBJECT = 3;

		String[] names = new String[MAX_STUDENT];
		int[][] scores = new int[MAX_STUDENT][MAX_SUBJECT];
		int[] total = new int[MAX_STUDENT];
		double[] average = new double[MAX_STUDENT];
		String[] grades = new String[MAX_STUDENT];

		int count = inputStudent(scores, names, MAX_STUDENT, MAX_SUBJECT);
		gradeCalc(MAX_STUDENT, MAX_SUBJECT, count, scores, total, average, grades);
		printTable(MAX_STUDENT, MAX_SUBJECT, names, scores, total, average, grades, count);

	}// main

	static int inputStudent(int[][] scores, String[] names, final int MAX_STUDENT, final int MAX_SUBJECT) {
		Scanner sc = new Scanner(System.in);

		int count = 0, score = 0;
		System.out.println(MAX_STUDENT + "명의 이름과 성적을 입력해주세요.");
		System.out.print((count + 1) + "번 학생 이름(\'end\' 입력시 종료) : ");
		String name = sc.nextLine();
		while (!name.equals("end")) {
			count++;
			names[count - 1] = name;

			for (int i = 0; i < MAX_SUBJECT; i++) {
				System.out.print((i + 1) + "번 과목 점수 : ");
				score = Integer.parseInt(sc.nextLine());
				scores[count - 1][i] = score;
			} // for

			System.out.println();
			if (count < MAX_STUDENT) {
				System.out.print((count + 1) + "번 학생 이름(\'end\' 입력시 종료) : ");
				name = sc.nextLine();
			} else {
				break;
			}
		} // while

		return count;
	}// inputStudent

	static void gradeCalc(final int MAX_STUDENT, final int MAX_SUBJECT, int count, int[][] scores, int[] total,
			double[] average, String[] grades) {
		final double EXCELLENT = 90.0;
		final double FAIL = 60.0;

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < MAX_SUBJECT; j++) {
				total[i] += scores[i][j];
			} // for

			average[i] = total[i] / (double) MAX_SUBJECT;

			if (average[i] >= EXCELLENT) {
				grades[i] = "Excellent";
			} else if (average[i] < FAIL) {
				grades[i] = "Fail";
			} else {
				grades[i] = "";
			} // if
		} // for
	}// gradeCalc

	static void printTable(final int MAX_STUDENT, final int MAX_SUBJECT, String[] names, int[][] scores, int[] total,
			double[] average, String[] grades, int count) {
		System.out.println("\n\t\t<< 성적표 >>\n");
		for (int i = 0; i < count; i++) {
			System.out.print(names[i] + "\t");
			for (int j = 0; j < MAX_SUBJECT; j++) {
				System.out.print(scores[i][j] + "\t");
			} // for
			System.out.print(total[i] + "\t" + average[i] + "\t" + grades[i] + "\n");
		} // for
	}// printTable

}// class
