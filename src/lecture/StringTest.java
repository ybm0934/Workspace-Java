package lecture;
import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {

		String str = "hello";
		System.out.println("str : " + str);

		String str2 = str;
		System.out.println("str2 : " + str2);

		str2 = str2 + "hello";
		System.out.println("str2 : " + str2);
		System.out.println("str : " + str);
		
		System.out.print("Input string : ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		System.out.println("str : " + str);

	}

}
