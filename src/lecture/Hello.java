package lecture;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {

		System.out.println("Hello, Java!!");

		{
			int number1 = 10;
			int number2 = 200;
			int result = number1 + number2;
			System.out.println(number1 + " + " + number2 + " = " + result);
		}

		RealNumber();
		//CharTest();

	}

	public static void Multi() {

		int num = 0;
		int i = 0;
		int j = 0;
		String str = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력해 주십시오.");
		num = sc.nextInt();

		for (i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}

		System.out.println("--------------------------------------");

		System.out.println("문자를 입력해주십시오.");
		str = sc.next();

		System.out.println("당신이 입력한 문자는 " + str + "입니다.");

		System.out.println("--------------------------------------");

		System.out.println("구구단 출력 결과");
		for (i = 2; i < 10; i++) {
			for (j = 1; j <= i; j++) {
				System.out.println(i + " * " + j + " = " + (i * j) + "\n");
			}
		}

	}

	public static void CharTest() {
		char a = 51;

		System.out.println(a);

		Date today = new Date();

		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");

		System.out.println(format1.format(today));

		int abc = 999999999;

		System.out.println(abc * abc * abc * abc * abc * abc);

		Scanner input = new Scanner(System.in);
		final int SIZE = 3;
		int number[] = new int[3];
		int product = 1;

		try {
			for (int i = 0; i < SIZE; i++) {
				System.out.print((i + 1) + " 번째 숫자 : ");
				number[i] = input.nextInt(); // 입력
				product *= number[i]; // 배열의 값을 product에 곱함
			}
			if (product < 0 || product - Integer.MAX_VALUE > 0)
				// 입력 값이 음수이거나, 곱한 결과가 overflow
				throw new Exception();
		} catch (Exception e) { // 예외 발생시 오류 메시지 출력 후 종료
			System.out.println("입력 값이 음수이거나, 곱한 결과가 오버플로입니다.");
			System.exit(0);
		} finally { // 예외가 발생하지 않으면 결과 출력
			System.out.println("결과 : " + product);
		}

	}
	
	public static void RealNumber() {
		double d1 = 1.2194710980918940;
		double d2 = 1.2194710980918941;
		
		boolean b = (d1 == d2);
		
		double d3 = 1 / (double) 3;
		
		System.out.println(b);
		System.out.println(d3);
		
		char ch2 = '\uD55C';
		
		System.out.println(ch2);
		
		
	}
}
