package lecture;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		String str;

		System.out.print("Input number : ");
		// number = sc.nextInt();
		// sc.nextLine();
		number = Integer.parseInt(sc.nextLine());
		System.out.println("Input String : ");
		str = sc.nextLine();

		System.out.println("number => " + number);
		System.out.println("str => " + str);

	}

}
