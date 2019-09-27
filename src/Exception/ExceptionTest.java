package Exception;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		My[] array = new My[5];

		try {
			array[0] = new My();
			array[0].number = 10;
			for (My my : array) {
				System.out.println(my.number);
			}

			System.out.println("Input number : ");
			number = Integer.parseInt(sc.nextLine());
			System.out.println(5 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Error : Divide by zero");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception...");
			e.printStackTrace();
		}
	}
}

class My {
	public int number;
}
