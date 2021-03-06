package multithreading;

public class Exp6 implements Runnable {

	@Override
	public void run() {
		System.out.println("Method run. Thread name = " +
				Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Thread thread = new Thread(new Exp6());
		thread.run();

		System.out.println("Method main. Thread name = " +
				Thread.currentThread().getName());
	}
}
