package assignment;

import java.util.Scanner;
public class B20 {

    
  public static void main(String[] args)

{       
    int i,n=0,sum=0;
	float avg;
	{
	   
        System.out.println("Input the 5 numbers : ");  
         
	}
		for (i=0;i<5;i++)
		{
		    Scanner in = new Scanner(System.in);
		    n = in.nextInt();
		    
		    sum=sum+n;
	}
	avg=sum/5;
	System.out.println("sum  : " +sum+"\navg : " +avg);
 
}
}

