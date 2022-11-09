package file_io;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.io.Serializable;
	import java.util.Scanner;

	public class serial1_ex implements Serializable{
		int id;
		String name;
	public serial1_ex(int id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		serial1_ex s=new serial1_ex(1,"test");
		int ch;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter choice");
		System.out.println("plzz enter 1 before 2");
		ch=scan.nextInt();
		try {
			switch(ch) {
			case 1:
				
			FileOutputStream fout=new FileOutputStream("test3.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(s);
			break;
			case 2:
			FileInputStream fin =new FileInputStream("test3.txt");
			ObjectInputStream in=new ObjectInputStream(fin);
			serial1_ex se=(serial1_ex) in.readObject();
			System.out.println(se.id +" "+ se.name);
			break;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	}


