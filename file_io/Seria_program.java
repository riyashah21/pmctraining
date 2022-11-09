package file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Seria_program implements Serializable {
	int id;
	String name;
	public Seria_program(int id, String name) {
		this.id=id;
		this.name=name;
		
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	Seria_program s=new Seria_program(1,"test");
	try {
	/*	FileOutputStream fout=new FileOutputStream("Test_3.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(s); */
		FileInputStream fin=new FileInputStream("Test_3.txt");
		ObjectInputStream out=new ObjectInputStream(fin);
		Seria_program se=(Seria_program)out.readObject();
		System.out.println(se.id+" "+se.name); 
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	}
	
	
	
	
}
}