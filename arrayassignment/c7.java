package arrayassignment;

import java.util.Scanner;

public class c7 {
	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
			int i,n,temp;
			System.out.println("enter a no of elements");
			n=scn.nextInt();
			int a[]=new int[n];
			System.out.println("enter elements");
			for( i=0;i<n;i++) {
				a[i]=scn.nextInt();
			}
			for(i=0;i<n;i++) {
			System.out.print( +a[i]+" ");
			}
		for(i=0;i<n;i++) {
			a[i]=scn.nextInt();
			
		}
		for(i=0;i<n;i++) {
		for( int j=i+1;j<n;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
		System.out.println("second largesr" +a[n-2]);
		System.out.println("smaalest" +a[0]);
	}


}
	
