package oops;
class outer{
	static class static_class{
		static void static_method(){
			System.out.println("Static mehtod");
		}
		
	}
class non_static_class
{
	void non_static_method() {
		System.out.println("non static mehthod");
	}
}
}

public class nested_static {
	public static void main(String[] args) {
		outer.static_class s=new outer.static_class();
		outer o=new outer();
		outer.non_static_class  s1=o.new non_static_class();
		s1.non_static_method();
		}

}
