package assignment;

import java.util.Scanner;

public class b35 {
	public static void main(String[] args) {
	
	Scanner v1= new Scanner(System.in);
	int input=v1.nextInt();
	System.out.println("enter a no" +input);
	int n1=input / 1000000 %10;
	int n2=input / 100000 %10;
	int n3=input / 10000 %10;
	int n4=input / 1000 %10;
	int n5=input / 100 %10;
	int n6=input  %10;
	System.out.println(n1+ " "+ n2+ " " +n3+ " "+ n4+ " " +n5+ " "+n6+ " "  );

}
}