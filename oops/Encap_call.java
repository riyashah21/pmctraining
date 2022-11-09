package oops;
import java.util.Scanner;

public class Encap_call {
	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		System.out.println("enter a value");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		e.setId(n);
		String s=scn.next();
		e.setName(s);
		String s1=scn.next();
		e.setPassword(s1);
		//e.setName("abc");
		//e.setPassword("1234"
			//	+ "");
		System.out.println(e.getId()+" "+e.getName()+" "+e.getPassword());
		System.out.println(e.toString());
		
	}

}
