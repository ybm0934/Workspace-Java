package Homework;

import java.util.Scanner;

public class No_2_Answer {
	
	public static void main(String[] args) {
		// 3. 다음과 같이 출력하는 프로그램(10명 이내 이름이 'end'이면 결과 출력, 90이상 Excellent 60이하 Fail)
		// Hong 50 50 50 150 50.0 Fail
		// Kim 90 90 90 270 90.0 Excellent
		// Nam 70 70 70 210 70.0

		final int MAX_STUDENT = 10;
		final int MAX_SUBJECT = 3;

		String[] names = new String[MAX_STUDENT];
		int[][] subjects = new int[MAX_STUDENT][MAX_SUBJECT];
		int[] totals = new int[MAX_STUDENT];
		double[] averages = new double[MAX_STUDENT];
		String[] grades = new String[MAX_STUDENT];

		int count = 0;

		count = inputStudent(names, subjects, MAX_STUDENT, MAX_SUBJECT);
		calcScoreTable(subjects, totals, averages, grades, count, MAX_STUDENT, MAX_SUBJECT);
		printScoreTable(names, subjects, totals, averages, grades, count, MAX_STUDENT, MAX_SUBJECT);
	}

	public static int inputStudent(String[] names, int[][] subjects, final int MAX_STUDENT, final int MAX_SUBJECT) {
		Scanner sc = new Scanner(System.in);

		final int LOW_SCORE = 0;
		final int HIGH_SCORE = 100;

		String name;
		int subject;

		int count = 0;

		System.out.printf("[%2d]번째 학생 이름 입력 ( 이름이 \'end\' 또는 %2d명 이상 종료 ) : ", count + 1, MAX_STUDENT);
		name = sc.nextLine();
		while (!name.equals("end")) {
			++count;
			names[count - 1] = name;
			for (int i = 0; i < MAX_SUBJECT; ++i) {
				System.out.printf("\t[%2d]번째 과목 점수 입력 ( 0 ~ 100 ) : ", i + 1);
				subject = Integer.parseInt(sc.nextLine());
				while (subject < LOW_SCORE || subject > HIGH_SCORE) {
					System.out.printf("\tError : 점수는 0 ~ 100사이만 입력 하세요.\n\n");
					System.out.printf("\t[%2d]번째 과목 점수 입력 ( 0 ~ 100 ) : ", i + 1);
					subject = Integer.parseInt(sc.nextLine());
				}
				subjects[count - 1][i] = subject;
			}

			if (count < MAX_STUDENT) {
				System.out.printf("\n[%2d]번째 학생 이름 입력 ( 이름이 \'end\' 또는 %2d명 이상 종료 ) : ", count + 1, MAX_STUDENT);
				name = sc.nextLine();
			} else {
				break;
			}
		}

		return count;
	}

	public static void calcScoreTable(int[][] subjects, int[] totals, double[] averages, String[] grades, int count,
			final int MAX_STUDENT, final int MAX_SUBJECT) {
		final double EXCELLENT = 90.0;
		final double FAIL = 60.0;

		for (int i = 0; i < count; ++i) {
			for (int j = 0; j < MAX_SUBJECT; ++j) {
				totals[i] += subjects[i][j];
			}
			averages[i] = totals[i] / (double) count;

			if (averages[i] >= EXCELLENT) {
				grades[i] = "Excellent";
			} else if (averages[i] < FAIL) {
				grades[i] = "Fail";
			} else {
				grades[i] = "";
			}
		}
	}

	public static void printScoreTable(String[] names, int[][] subjects, int[] totals, double[] averages,
			String[] grades, int count, final int MAX_STUDENT, final int MAX_SUBJECT) {
		System.out.println();
		for (int i = 0; i < count; ++i) {
			System.out.printf("%-10s ", names[i]);
			for (int j = 0; j < MAX_SUBJECT; ++j) {
				System.out.printf("%5d", subjects[i][j]);
			}
			System.out.printf(" %6d %8.2f %-10s\n", totals[i], averages[i], grades[i]);
		}
	}

}
