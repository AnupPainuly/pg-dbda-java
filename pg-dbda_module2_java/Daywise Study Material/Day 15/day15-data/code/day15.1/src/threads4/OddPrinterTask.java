package threads4;

import java.util.stream.IntStream;

public class OddPrinterTask implements Runnable {
	private int begin;
	private int end;

	public OddPrinterTask(int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			IntStream.rangeClosed(begin, end) // Instream : ints from begin --end
					.filter(i -> i % 2 != 0) // Instream : ints from begin --end : odd nos
					.forEach(i -> {
						System.out.println(Thread.currentThread().getName() + " no " + i);
						try {
							Thread.sleep(20);
						} catch (InterruptedException e) {
							System.out.println(Thread.currentThread().getName() + " got exc " + e);
						}
					});
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got exc " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}

}
