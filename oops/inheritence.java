package oops;
class parent{
	int i;
	public parent(int i) {
		this.i=i;
		System.out.println("parent class con");
		}
	parent(String i){
		System.out.println(i);
	}
}
class child extends parent{
	public child() {
		super(10);
		System.out.println("child con"+super.i);
	}
	/* child(int i){
	  super(20);
	  System.out.println(i);
	 } */
}


public class inheritence {
	public static void main(String[] args) {
		new child();
		
	}

}
