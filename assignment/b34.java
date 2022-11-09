package assignment;

import java.util.Scanner;

public class b34 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter 1 no");
		double n1=scn.nextDouble();
		System.out.println("enter 2 1no");
		double n2=scn.nextDouble();
		
		if(n1>0 & n1<1 && n2>0 && n2<1) {
			System.out.println("true");
		}
		else {
			System.out.println("faLSE");
		}
			
	}
}
