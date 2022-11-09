package assignment;

public class B24 { 
	static int fact(int n) {
	
	int f;
	for(f=1;n>1;n--) {
		f *=n;
	}
	return f;
	}

static int ncr(int n,int r) {
	return fact(n)/(fact(n-r)*fact(r));
}
	


public static void main(String[] args) {
		System.out.println();
		int n=5;
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(" "+ncr(i,j));
			}
			System.out.println();
		}
		
	}
}
