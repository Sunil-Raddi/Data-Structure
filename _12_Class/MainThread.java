package _12_Class;

public class MainThread {

	static void display() {
		for(char ch = 'A'; ch<'Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println("Exception");
			}
		}

	}

	static void printer() {
		for(char ch = 'a'; ch<'z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println("Exception");
			}
		}
	}

	public static void main(String[] args) {

		class DThread extends Thread{
			@Override
			public void run() {
				display();
			}
		}

		class PThread extends Thread{
			@Override
			public void run() {
				printer();
			}
		}

		Thread t1 = new DThread();
		Thread t2 = new PThread();
		t1.start();
		t2.start();
	}

}
