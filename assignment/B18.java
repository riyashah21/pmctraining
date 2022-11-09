package assignment;

import java.util.Scanner;

public class B18 {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a year");
		int no=scn.nextInt();
		if((no%4==0) && (no%100!=0) || (no%400==0))
			System.out.println("it is leap yr");
		else
			System.out.println("not leap yr");
		
	}

}
