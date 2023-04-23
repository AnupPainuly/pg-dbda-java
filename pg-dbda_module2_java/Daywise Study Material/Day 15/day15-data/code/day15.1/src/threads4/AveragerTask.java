package threads4;

import java.util.stream.IntStream;

public class AveragerTask implements Runnable {
	private int begin;
	private int end;

	public AveragerTask(int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			double avg = IntStream.rangeClosed(begin, end) // Instream : ints from begin --end
					.average().orElseThrow();
			System.out.println("Avg printed by " + Thread.currentThread().getName() + " : " + avg);

		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got exc " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}

}
