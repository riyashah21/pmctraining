package assignment;

import java.util.Scanner;

public class B17 {
	public static void main(String[] args) {
		String s;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string:");
		s=scan.next();
		int l=s.length();
		char ch=s.charAt(0);
		if(l>1)
		{
			System.out.println("error");
		}
		else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='O' || ch=='I' || ch=='U' )
		{
			System.out.println(ch + " is vowel");
		}
		else if((ch>=65 && ch <= 90) || (ch>= 97 && ch<= 122) )
		{
			System.out.println(ch + " is constant");
		}
		else
		{
			System.out.println("error");
		}
	}
}
