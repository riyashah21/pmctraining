package arrayassignment;

public class b13 {
	public static void main(String[] args) {
		
		int a[]= {1,4,6,8,9,4};
		int sum=0;
		
		for(int i:a) {
			sum=sum+i;
		}
			float avg=sum/a.length;
		
		System.out.println("avg is\n" +avg);

	}

}
