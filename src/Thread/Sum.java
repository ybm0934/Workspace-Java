package Thread;

public class Sum {
	private int sum = 0;

	public Sum() {
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void calc(int start, int stop) {
		for (int i = start; i <= stop; i++) {
			synchronized (this) { // 동기화 문제를 해결하기 위해서는 synchronized를 사용하면 된다.
				sum += i; // Critical Section, Thread에서 공유 자원을 사용하는 Code Block
			}
		}
	}
}