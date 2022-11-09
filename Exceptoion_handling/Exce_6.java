package Exceptoion_handling;

public class Exce_6 {
	public static void main(String[] args) {
		try {
			iny i=10/0;
			System.out.println(i);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			int i=0;
			if(i>=0) {
				System.out.println(i);
			}
			System.out.println("ae");
		}
	}

}
