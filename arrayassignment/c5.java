package arrayassignment;

import java.util.Scanner;

public class c5 {
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
			for(i=0;i<n;i++) {
			System.out.print( +a[i]+" ");
			}
	for(i=0;i<a.length-1;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j] && (i!=j)) {
				System.out.println("\nduplicate:"+a[j]);
			}
		}
	}
	
	}

}
