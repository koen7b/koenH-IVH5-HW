package concurrency;

public class PrintNum implements Runnable {
	
	private int num;
	
	public PrintNum(int num){
		this.num = num;
		
	}
	public void run() {
		for (int x=0; x<num; x++){
			System.out.println(x);
		}
	}
}
