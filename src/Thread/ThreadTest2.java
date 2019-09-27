package Thread;

public class ThreadTest2 {

	public static Value value = new Value();

	public static void main(String[] args) {

		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				++value.number;
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
				System.out.println(value.number);
			}
		});

		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				++value.number;
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				System.out.println(value.number);
			}
		});

		th1.start();
		th2.start();

	}

}

class Value {
	public int number = 0;
}