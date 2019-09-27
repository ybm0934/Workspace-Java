package lecture;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");
		int number = sc.nextInt();

		switch (number) {
		case 1:
		case 2:
		case 3:
			System.out.println("number 1");
			break;
		case 10:
		case 20:
			System.out.println("number 2");
			break;
		default:
			System.out.println("other number");
		}

	}

}