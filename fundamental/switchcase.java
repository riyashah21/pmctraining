package fundamental;

public class switchcase {

	public static void main(String[] args) {
		
		int a=10,b=20,ans;
		char c='+';
		switch (c) {
		
		case '+':
		ans=a+b;
		System.out.println(ans);	
		break;
		
		case '-':
			ans=a-b;
			System.out.println(ans);	
			break;
			
		case '*':
			ans=a*b;
			System.out.println(ans);	
			break;
			
		case '/':
			ans=a/b;
			System.out.println(ans);	
			break;

		default:
			System.out.println("default statment");
			break;
		}
	
	}

}