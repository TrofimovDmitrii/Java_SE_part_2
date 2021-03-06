package multithreading;

public class SynchronizedBlock1 {
	public static void main(String[] args) {
		MyRunnableImpli2 runnable = new MyRunnableImpli2();
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		Thread thread3 = new Thread(runnable);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class Counter2 {
	static int count = 0;
}

class MyRunnableImpli2 implements Runnable {

	private void doWork1() {
		doWork2();
		synchronized(this) {
			Counter2.count++;
			System.out.println(Counter2.count);
		}
	}

	private void doWork2() {
		System.out.println("!!!");
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			doWork1();
		}
	}
}
