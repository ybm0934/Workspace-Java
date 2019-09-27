package lecture;

public class IntTest {

	public static void main(String[] args) {

		int var = 0;
		int var2 = 10;
		final int MAX = 100;

		System.out.println("var : " + var);
		System.out.println("var2 : " + var2);
		System.out.println("MAX : " + MAX);

		var = 1000;
		var2 = var2 + 10;
		//MAX = MAX + 1;

		System.out.println("var : " + var);
		System.out.println("var2 : " + var2);
		System.out.println("MAX : " + MAX);

		System.out.println(var < 0);
		System.out.println(var2 != 100);
		System.out.println(var < 0 && var2 != 100);

	}

}
