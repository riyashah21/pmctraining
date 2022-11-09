package arrayassignment;

import java.util.Scanner;

public class b14 {
	
	public static boolean test(int[] a, int i) {
	      for (int n : a) {
	         if (i == n) {
	            return true;
	         }
	      }
	      return false;
	   }
	   public static void main(String[] args) {
	          int[] a = {
	            1,4,6,89,563,23,46,32,45};
	      System.out.println(test(a, 4));
	      System.out.println(test(a, 6));
	   }
	}
