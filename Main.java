public class Main {
	public static void main(String[] args) {
		
		MinhaThread mT1 = new MinhaThread(1, 10);
		MinhaThread mT2 = new MinhaThread(2, 10);
		MinhaThread mT3 = new MinhaThread(3, 10);

		mT1.start();
		mT2.start();
		mT3.start();

		mT1.setPriority(Thread.MIN_PRIORITY);
		mT2.setPriority(Thread.MIN_PRIORITY);
		mT3.setPriority(Thread.MAX_PRIORITY);
		
		for(int i = 0; i < Integer.MAX_VALUE; i++) {
			int a = i + 1;
		}
		System.out.println("\nMain");
	}
}
class MinhaThread extends Thread {
	public volatile int counter = 0;   
	int id = 0, limite = 0;
	MinhaThread(int novoId, int novoLimite) {
		this.id = novoId;
		this.limite = novoLimite;
	}
	public void run() {
		for(int i = 0; i < limite; i++) {
			counter++;
			System.out.println(counter);
		}
		System.out.println("\nTerminou thread " + id);
	}
}