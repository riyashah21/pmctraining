package assignment;

import java.util.Scanner;

public class b31 {
	    	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter 1 int");
		int n1=scn.nextInt();
		System.out.println("enter 2nd int");
		int n2=scn.nextInt();
		System.out.println("enter 3rd int");
		int n3=scn.nextInt();
		if(n3==n1+n2) {
			System.out.println("the result is:true");
		}
		else {
			System.out.println("false");
		}
	    	}

}
