package Array;

import java.util.Scanner;

class admin{
	int size;//make variable declaration global
	Scanner scan=new Scanner(System.in);
	int id[];
	String name[];
	public admin() {
		// TODO Auto-generated constructor stub
		System.out.println("enter total no. of student");
		size=scan.nextInt();
	}
}
class teacher extends admin{
	public teacher() {
		// TODO Auto-generated constructor stub
		id=new int[size];
		name=new String[size];
		System.out.println("enter id and name: ");
		for(int i=0;i<size;i++)
		{
			id[i]=scan.nextInt();
			name[i]=scan.next();
		}
		
	}
}
class report extends teacher{
	public report() {
		// TODO Auto-generated constructor stub
		for(int i=0;i<size;i++)
		{
			System.out.println(id[i] + " "+ name[i]);
		}
	}
}

public class array_inheritance {
	public static void main(String[] args) {
		new report();
	}

}