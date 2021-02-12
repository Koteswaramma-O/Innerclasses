package innerclasses;

public class AnonymousThread {
	public static void main(String[] args) {

		// Using Anonymous Inner class that extends a Class
		// Here a Thread class
		Thread thread = new Thread() {
			public void run() {
				System.out.println("Child Thread");
			}
		};
		System.out.println("mainThread");
		thread.run();
	}

}

class MyThread {

	public static void main(String[] ars) {
		Runnable inter = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Child Thread");
			}
		};
		Thread t = new Thread(inter);
		t.run();
		System.out.println("MainThread");

	}
}
