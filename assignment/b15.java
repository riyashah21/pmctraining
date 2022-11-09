package assignment;
import java.util.Scanner;

public class b15 {
	 	
		
			public static void main(String[]args) {
				
				System.out.println("sajiiojd");
				Scanner scn =new Scanner(System.in);
				int a=scn.nextInt();
				System.out.println("a="+a);
				int b=scn.nextInt();
				System.out.println("b="+b);
				int c=scn.nextInt();
				System.out.println("c="+c);
				
				if(a>b && a>c) {
					System.out.println("a is greatest");
					}
				else if(a<b && b>c) {
					System.out.println("b is greatest");
					
				}
				else{
					System.out.println("c is greatest");
				}
				
				
			}
	
	

}
