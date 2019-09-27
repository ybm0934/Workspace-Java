package lecture;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

		// 1. 10명 학생의 점수를 입력 받아 평균을 계산하고 점수와 평균과의 차를 출력하는 프로그램

		Scanner sc = new Scanner(System.in);

		final int MAN = 3;
		int i = 0;
		int[] sco = new int[MAN]; // 학생 점수
		int sum = 0; // 총점
		double avg; // 반 평균
		double sub; // 편차

		System.out.println("10명의 학생 점수를 입력하세요.");
		for (i = 0; i < sco.length; i++) {
			System.out.print((i + 1) + "번 학생의 점수 : ");
			sco[i] = sc.nextInt();
			sum += sco[i];
		}

		avg = sum / (double) MAN;

		for (i = 0; i < sco.length; i++) {
			sub = sco[i] - avg;
			System.out.println("총점 [ " + sum + " ], 반 평균 [ " + avg + " ]과 " + (i + 1) + "번 학생의 점수 [ " + sco[i]
					+ " ]과의 평균 차이 [ " + sub + " ]");
		}

	}

}
