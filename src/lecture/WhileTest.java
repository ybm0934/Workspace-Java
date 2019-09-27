package lecture;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		// 2. 정수를 입력 받아서 짝수의 개수와 홀수의 개수를 출력하는 프로그램을 만드시오. (단, 0이 나오면 종료)

		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int i = 1;

		// System.out.println(i + "번째 정수를 입력하세요.");
		// int j = sc.nextInt();
		while (true) { // (j != 0)
			System.out.println(i + "번째 정수를 입력하세요.");
			int j = sc.nextInt();
			if (j != 0) {
				if ((j % 2) == 0) {
					a++;
				} else {
					b++;
				}
			} else {
				break;
			}
			i++;
		}
		System.out.println("\n0이 나와서 종료합니다.");
		System.out.println("홀수의 갯수는 " + b + "개이고, 짝수의 갯수는 " + a + "개입니다.");

	}

}
