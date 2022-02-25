package threads;

import threads.DemoRaceCondition.Increment;

public class DemoSynchronisieren {
	static final int iterations = 1_000_000;

	static int count = 0;

	static class Increment implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < iterations; i++) {
				synchronized (DemoSynchronisieren.class) {
					count++;					
				}			
			}
			System.out.println("Thread " + Thread.currentThread().getId() + " ist vorbei");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Runnable incrementTask = new Increment();

		Thread t1 = new Thread(incrementTask);
		Thread t2 = new Thread(incrementTask);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("count: " + count);
	}
}
