package Exceptoion_handling;
//alwyas executed
//alwyas try-catch block

public class finally_block {
	
	public finally_block() {
		try {
			int i=10/2;
			System.out.println(i);
			
		}catch(Exeption e) {
			System.out.println(e);
		}
		finally {
			System.out.println("AE");
		}
		
		//
	}
	public static void main(String[] args) {
		new finally_block();
		
		
	}

}
