package file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_read {
	public static void main(String[] args) {
		
		try {
			FileInputStream fin=new FileInputStream("test.txt");
			int i=0;
			while((i=fin.read())!=-1) {
				System.out.print((char) i);
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
