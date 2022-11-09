package oops;
class paren{
	public paren() {
		// TODO Auto-generated constructor stub
		System.out.println("this is a parent class");
	}
	
}
class chil extends paren{
	public chil() {
		System.out.println("this is child class");
	}
}

public class O38 {
	public static void main(String[] args) {
		new paren();
		new chil();
		
	}
	
	

}
