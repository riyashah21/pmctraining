package Exceptoion_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class file_io1 {
public static void main(String[] args) {
	 try {
		FileInputStream fin=new FileInputStream("test4.txt");
		FileInputStream fin1=new FileInputStream("test.txt");
		//merge file content
		SequenceInputStream sin=new SequenceInputStream(fin,fin1);
		int i=0;
		while((i=sin.read())!=-1) {
			System.out.print((char)i);
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
}
}
