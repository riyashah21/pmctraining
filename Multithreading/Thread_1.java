package Multithreading;

public class Thread_1 extends Thread {
	
	public void run() {
		for (int i=0;i<=10;i++) {
			try {
				Thread.sleep(4000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		//System.out.println("test!!");
	}
	public static void main(String[] args) {
		Thread_1 t=new Thread_1();
		t.start();
	}

}
