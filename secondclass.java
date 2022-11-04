package exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//try with resources
public class secondclass {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br=null;
		try(BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
) {
		String str="";
			str=br1.readLine();
		}
	}

}
