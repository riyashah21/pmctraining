package assignment;

import java.util.Scanner;

public class B21 {
	public static void main(String[] args) {

	
		System.out.println("enter a no");
		Scanner scn=new Scanner(System.in);
		int r=scn.nextInt();
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	}

