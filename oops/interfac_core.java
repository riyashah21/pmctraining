package oops;

public class interface_call implements myinterface,myinterface1,myinterface2,myinterface3{

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println("test3");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("test2");
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("test2");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("interface method call");
	}
	public static void main(String[] args) {
		interface_call i=new interface_call();
		i.test();
		i.test1();
		i.test2();
		i.test3();
	}
}