package oops;
class parent1{
	void test(int i) {
		System.out.println("parent class method");
		}
}
class child1 extends parent1{
	void test() {
		super.test(10);
		System.out.println("child class method");
	}
}

public class method_overloading {
	 
	public static void main(String[] args) {
		
		new child1().test();
	}
	
	

}
