package concurrency;

public class PrintChar implements Runnable {
	
	private char character;
	private int num;
	
	public PrintChar(char character, int num){
		this.character = character;
		this.num = num;
		
	}
	public void run() {
		for (int x=0; x<num; x++){
			System.out.println(character);
		}
	}
}
