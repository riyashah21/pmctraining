package Exceptoion_handling;

class Test_Exception extends Exception{

public Test_Exception(String string) {
		// TODO Auto-generated constructor stub
	super(s);
	}

public class custom_exception {
	 void test() throws Test_Exception {
		 int i=0;
		 if(i>0) {
			 System.out.println(i);
		 }
		 else {
			 throw new Test_Exception("invalid ");
		 }
	 }
	public static void main(String[] args) throws Test_Exception {
		custom_exception c=new custom_exception();
		c.test();
	}
		
	}
}


