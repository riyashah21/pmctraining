package arrayassignment;

import java.util.Scanner;

public class c6 {
	
	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in); 
			System.out.println("enter no of chAr u want to entere");
			int n=scn.nextInt();
			String a[]=new String[n];
			System.out.println("enter a name");
			for(int  i=0;i<a.length;i++) {
				
				a[i]=scn.next();
			}
			for(String e:a) {
				System.out.print(e);
			}
	for(int i=0;i<a.length-1;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j] && (i!=j)) {
				System.out.println("\nduplicate:"+a[j]);
			}
		}
	}
	
	}

}



