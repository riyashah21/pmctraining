package oops;

@FunctionalInterface
interface A {
	void show();
	// String toString();
}

//class B extends Object implements A {
//	public void show() {
//		System.out.println("hi");
//	}
//	
//}
public class demo {
	public static void main(String[] args) {
		A obj = () ->
				System.out.println("hi in show");
		obj.show();
	}
}
