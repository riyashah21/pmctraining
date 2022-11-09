package final_modifier;

 class parent_1{
	final int a;
	
	public parent_1() {
		a=20;
		System.out.println(a);
		
	}
	/*final void test(){
		System.out.println("final method");
		
	}*/
	  
	 }
class child_1 extends parent_1
{
	/*void test() {
		System.out.println("final method");
		
	}*/
	
}

public class final_p {
	public static void main(String[] args) {
		new parent_1();
	}

}
