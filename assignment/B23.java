package assignment;



public class B23 {
	
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				if((i+j)%2==1) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
		
	}

}
