package arrayassignment;

import java.util.Scanner;

public class c4 {
	 public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
			int i,n;
			System.out.println("enter a no of elements");
			n=scn.nextInt();
			int a[]=new int[n];
			System.out.println("enter elements");
			for( i=0;i<n;i++) {
				a[i]=scn.nextInt();
				
			
			}
			System.out.println(a[i]);
			System.out.println("reverse order");
			for(i=a.length-1;i>=0;i--) {
				System.out.println(a[i]+" ");
			}
	}

}
