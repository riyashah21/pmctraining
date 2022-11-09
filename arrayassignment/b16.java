package arrayassignment;

import java.util.Scanner;
public class b16 {

public static int max(int[] arr){ 
    int maxValue = arr[0]; 
    for(int i=1;i < arr.length;i++){ 
      if(arr[i] > maxValue){ 
         maxValue = arr[i]; 
      } 
    } 
    return maxValue; 
  }
  
  public static int getMin(int[] arr){ 
    int minValue = arr[0]; 
    for(int i=1;i<arr.length;i++){ 
      if(arr[i] < minValue){ 
        minValue = arr[i]; 
      } 
    } 
    return minValue; 
  } 

public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int i,n,s,flag=0;
	System.out.println("enter a no of elements");
	n=scn.nextInt();
	int a[]=new int[n];
	System.out.println("enter elements");
	for( i=0;i<n;i++) {
		a[i]=scn.nextInt();
	}
	int max=max(a);
	System.out.println("max value:" +max);
	int min=getMin(a);
	System.out.println("min value" +min);
}
}