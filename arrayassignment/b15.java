package arrayassignment;

import java.util.Scanner;

public class b15 {
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
		System.out.println("enter elements to be searched");
		s=scn.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==s) {
				System.out.println("element"+s+ "index no" +i);
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("element" +s+ "not found");
		}
		
		}
	
}
	 