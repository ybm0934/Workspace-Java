package Exception;

public class ExceptionTest2 {

	public static void main(String[] args) throws Exception {

		try {
			System.out.println(5 / 0);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println();
			System.out.println("stop program..");
		}

	}

}
