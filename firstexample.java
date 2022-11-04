package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class firstexample {

	public static void main(String[] args) {

		int i, j=0,k=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		i = 9;
		
		try {
			System.out.println("enter a num:");
			j = Integer.parseInt(br.readLine());
		 k=i/j;
		 System.out.println("output is" +k);
		}
		catch(IOException e) {
			System.out.println("some i/o error");
		}
		//System.out.println(k);
		catch(Exception e) {
			System.out.println("unknown exception" +e);
		}
		finally {
			br.close();
			System.out.println("bye");
		}
	}
}