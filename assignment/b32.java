package assignment;

import java.util.Scanner;
public  check(int p,int q){
	if(p<25 ||q>75)
		return false;
	int n1=p%10;
	int n2=q%10;
	p/=10;
	q/=10;
	return(p==q||p==n2||n1==q||n1==n2);
}

public class b32 {
	public static void main(String[] args) {
		
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter an 1 integer between 25 to 75");
		int n1=scn.nextInt();
		System.out.println("enter 2 integer between 25 to 75");
		int n2=scn.nextInt();
		System.out.println("result:" +check(n1,n2));
		}

}
