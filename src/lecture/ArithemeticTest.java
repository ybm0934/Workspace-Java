package lecture;

import java.util.Scanner;

public class ArithemeticTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1, number2;

		System.out.println("Input number1 : ");
		number1 = sc.nextInt();
		System.out.println("Input number2 : ");
		number2 = sc.nextInt();

		int resultAdd, resultSub, resultMultiple, resultDivide, resultRemaind;
		resultAdd = number1 + number2;
		resultSub = number1 - number2;
		resultMultiple = number1 * number2;
		resultDivide = number1 / number2;
		resultRemaind = number1 % number2;

		System.out.println(number1 + " + " + number2 + " = " + resultAdd);
		System.out.println(number1 + " - " + number2 + " = " + resultSub);
		System.out.println(number1 + " * " + number2 + " = " + resultMultiple);
		System.out.println(number1 + " / " + number2 + " = " + resultDivide);
		System.out.println(number1 + " % " + number2 + " = " + resultRemaind);

		float a, b;
		a = 5f;
		b = 3f;
		System.out.println("\n" + a / b + "\n");

		System.out.println(5 / 2);
		System.out.println(5 / 2.0);
		System.out.println(5 / (double) 2);

		number1 = number1 + 1;
		System.out.println("number1 = " + number1);
		number1 = ++number1 + 1;
		System.out.println("number1 = " + number1);

		System.out.println(number1 + " > " + number2 + " -> " + (number1 > number2));

		String abc = (number1 < number2) ? number1 + "이(가) 더 작습니다." : number2 + "(이)가 더 큽니다.";

		System.out.println(abc);

		System.out.println(resultAdd > 50 || resultSub < 50);
		System.out.println(resultAdd > 50 && resultSub < 50);

		if (resultAdd > 50) {
			System.out.println(number1 + "와(과) " + number2 + "의 합은 " + resultAdd + "이며 50보다 큽니다.");
		} else {
			System.out.println(number1 + "와(과) " + number2 + "의 합은 " + resultAdd + "이며 50보다 작습니다.");
		}
		
	}

}
