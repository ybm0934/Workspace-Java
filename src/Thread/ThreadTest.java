package Thread;

public class ThreadTest {
	public static void main(String[] args) {

		// 멀티 스레드 프로그램은 순서 없이 각자 실행된다.

		MyThread myth = new MyThread();
		Thread myth2 = new Thread(new MyThread2());

		myth.setDaemon(true);
		myth2.setDaemon(true);
		// JVM에서 쓰레드를 종료하지 못한 경우, setDaemon(true)를 사용하여 쓰레드를 종료해준다.
		// main이 종료되면 강제적으로 종료한다. (단, 데몬 쓰레드와 메인 쓰레드는 동시에 돌아간다.)
		// 데몬 스레드는 주 스레드의 보조 역할을 수행하므로, 주 스레드가 종료되면 데몬 스레드의 존재 의미가 없어지기 때문이다.

		myth.start();
		myth2.start();

		try {

			/*
			 * join은 선언한 쓰레드가 종료되기까지 기다렸다가 작업이 종료되면 join()을 호출한 쓰레드로 돌아와 실행을 계속한다. 즉, Join
			 * 메소드는 하나의 스레드가 다른 스레드가 하는 일이 완료될 때 까지 기다리도록 할 때 쓰인다. 가령 현재 돌아가고 있는 스레드(A)에서 또
			 * 다른 스레드(B) 가 완료될 때 까지 기다리려고 한다면, B.join(); 이렇게 호출 해주면 된다. 이렇게 하면, 현재 돌아가고 있는
			 * 스레드 A 는 스레드 B 가 하는 일이 마칠 때 까지, 멈춰있게(pause) 된다.
			 */

			myth.join();
			myth2.join();

			// myth 스레드가 종료될 때까지 기다렸다가 main 스레드를 실행한다.
			// daemon과 join 선택해서 사용

		} catch (Exception e) {
		}

		for (int i = 1; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {
//			}
		}

	}

}

class MyThread extends Thread { // thread는 상속 방식이기 때문에 다중 상속이 되지 않는다.

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println(getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

}

class MyThread2 implements Runnable { // runnable은 인터페이스 방식이기에 다중 상속을 지원한다. 따라서 runnable을 많이 씀

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}