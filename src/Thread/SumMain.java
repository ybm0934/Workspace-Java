package Thread;

public class SumMain {

	public static void main(String[] args) {

		Sum sum = new Sum();

		Worker worker1 = new Worker(sum, 1, 30);
		worker1.setName("Worker Thread1");

		Worker worker2 = new Worker(sum, 31, 60);
		worker1.setName("Worker Thread1");

		Worker worker3 = new Worker(sum, 61, 100);
		worker1.setName("Worker Thread1");

		worker1.start();
		worker2.start();
		worker3.start();

		try {
			worker1.join();
			worker2.join();
			worker3.join();
		} catch (Exception e) {

		}

		System.out.println("1 + 2 + 3 + ... + 98 + 99 + 100 = " + sum.getSum());
		// 계속 실행 시 결과는 5050이 나오지 않을 수도 있다. 구조상으로나 논리상으로나 틀린 것이 없는데 값이 다르게 나오기도 한다.
		// 그 이유는, 윈도우는 스케줄러가 프로그램 실행 시간을 관리하는데, Sum이라는 같은 자원을 쓰게 되면 동시에 요청이 올 시 스케줄러가 어느
		// 것을 먼저 받아 들여야할지 결정하지 못한다. 이런 문제를 '동기화' 문제라고 한다. 동기화 문제는 공유자원을 결정적으로 사용함으로 발생되는
		// 문제를 말한다. 이것을 해결하기 위해서는 synchronized를 사용한다. (Sum Class 참고)

	}

}
