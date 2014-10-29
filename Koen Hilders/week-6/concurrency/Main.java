package concurrency;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable printA = new PrintChar('A', 100);
		Runnable printB = new PrintChar('B', 100);
		Runnable printC = new PrintNum(100);
		

		Thread thread1 = new Thread(printA);
		Thread thread2 = new Thread(printB);
		Thread thread3 = new Thread(printC);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}


}
