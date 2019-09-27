package Thread;

public class Worker extends Thread {
	private Sum sum;

	private int start;
	private int stop;

	public Worker(Sum sum, int start, int stop) {
		this.sum = sum;
		this.start = start;
		this.stop = stop;
	}

	@Override
	public void run() {
		sum.calc(start, stop);
	}

}
