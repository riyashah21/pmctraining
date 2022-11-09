package oops;

public class O37 {
	public static void area(int x,int y) {
		System.out.println("rectangle area\n" +x*y);
	}
		
	public static void area(int x) {	
		System.out.println("square area\n" +x*x);
	}
	
	public static void main(String[] args) {
		area(9,5);
		area(5);
	}
	}

