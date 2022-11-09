package oops;

import java.util.Scanner;

public class construct {
	public construct() {//default constructor
		System.out.println("default constructor");
		// TODO Auto-generated constructor stub
	}
	public construct(int i) {
		System.out.println("i=" +i);
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value:");
		int a=scan.nextInt();
		
		construct obj=new construct();//object
		construct obj1=new construct(a);
	}

}
