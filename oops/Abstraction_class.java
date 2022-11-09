package oops;
abstract class Ab_class{
	abstract void method();
	
	void test() {
		System.out.println("test");
	}
}

public class Abstraction_class extends Ab_class {
	public static void main(String[] args) {
		Abstraction_class a=new Abstraction_class();
		a.method();
		a.test();
	}
	




	@Override
	void method() {
		// TODO Auto-generated method stub
		System.out.println("abstract class method");
		
	}
}