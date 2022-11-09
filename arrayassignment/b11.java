package arrayassignment;

import java.util.Arrays;

public class b11 {
	public static void main(String[] args) {
		
		int a[]= {15,2,3,4,56,654};
		String b[]= {"gdfred","sfm","gfrdd","sdss"};
		System.out.println("original array:" +Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("sorted array:" +Arrays.toString(a));
		
		System.out.println("original array:" +Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("sorted array:" +Arrays.toString(b));
		
	}

}
