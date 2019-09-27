package lecture;
import java.util.Scanner;

public class IOTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;

		System.out.println("Input integer number : ");
		number = sc.nextInt();

		System.out.println("number : " + number);

		number = number + 5;
		System.out.println("number : " + number);

		double dnumber;
		System.out.println("Input double number : ");
		dnumber = sc.nextDouble();
		System.out.println("dnumber : " + dnumber);

		String str;
		System.out.println("Input String : ");
		str = sc.next();
		System.out.println("str : " + str);
		

	}

}
