package arrayassignment;

import java.util.Scanner;

public class c1 {
	
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
			
	System.out.println("enter a no to be deleted");
	s=scn.nextInt();
	for(i=s;i<n-1;i++) {
		a[i]=a[i+1];
		
	}
	n=n-1;
	System.out.println("after removing\n");
	for(i=0;i<n;i++) {
		System.out.println("a["+i+"]=" +a[i]);
	}
	}
	 }
