package file_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_create {
	
	public File_create() {
		
		try {
			FileOutputStream fout=new FileOutputStream("test.txt");
			String s="this is text.txt file content";
			byte b[]=s.getBytes();
			fout.write(b);
			FileOutputStream fout1=new FileOutputStream("test4.txt");
			String s1="my name is riya";
			byte c[]=s1.getBytes();
			fout1.write(c);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
		
	}
	public static void main(String[] args) {
		new File_create();
		
	}

}
