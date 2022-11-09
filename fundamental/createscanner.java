package fundamental;
import java.util.Scanner;

public class createscanner {

	public static void main(String[] args){
		int add,mul,div,sub;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter two int");
		int s1=scn.nextInt();
		int s2=scn.nextInt();
		add=s1+s2;
		mul=s1*s2;
		div=s1/s2;
		sub=s1-s2;
		
		System.out.println(add);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(sub);

		}

}
