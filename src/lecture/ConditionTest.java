package lecture;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int MAX_LOOP = 3;
		int number1, number2;
		
		for (int i = 1; i <= MAX_LOOP; ++i) {
			System.out.println("정수 2개를 입력하시오.");
			number1 = sc.nextInt();
			number2 = sc.nextInt();
			if (number1 > number2) {
				System.out.println(number1 + "이(가) 더 큽니다.");
			} else if (number2 > number1) {
				System.out.println(number2 + "이(가) 더 큽니다.");
			} else {
				System.out.println(number1 + "와(과) " + number2 + "이(가) 같습니다.");
			}
		}
		
		/*
		 * String result = (number1 > number2) ? number1 + "이(가) 더 큽니다." : number2 +
		 * "이(가) 더 큽니다.";
		 * 
		 * System.out.println("삼항연산자 결과 = " + result);
		 * 
		 * 
		 * 
		 * switch (number1) { case 0: System.out.println("number1은 0입니다."); break; case
		 * 1: System.out.println("number1은 1입니다."); break; default:
		 * System.out.println("number1은 그 밖의 수입니다."); break; }
		 */
	}

}
