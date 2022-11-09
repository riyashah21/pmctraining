package arrayassignment;

import java.util.Scanner;

public class c2 {
	 public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
			int i,n,s,flag=0;
			System.out.println("enter a no of elements");
			n=scn.nextInt();
			int a[]=new int[n];
			System.out.println("enter elements");
			for( i=0;i<n;i++) {
				a[i]=scn.nextInt();
				
			}
			int a1[]=new int[a.length];
			for(i=0;i<n;i++) {
				a1[i]=a[i];
				
			}
			System.out.println(" after copying element of array");
			for(i=0;i<a1.length;i++) {
				System.out.println(a1[i]+"");
			}
			System.out.println();
			
	 }
}
