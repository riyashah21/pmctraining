package oops;

public class static_method {
	
	int a=1;
	static int b=1;
	
	static void test() {
		System.out.println(b);

	}
	void test1() {
		System.out.println(a+b);
		
	}
public static void main(String[] args) {
	test();
	static_method.test();
	new static_method().test1();
	
}
}