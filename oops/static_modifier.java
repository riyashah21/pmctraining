package oops;

public class static_modifier {
		int id;
		String name;
		static String college="svit";
		
		public static_modifier(int id,String name) {
			this.id=id;
			this.name=name;
			System.out.println(id+" "+name+" "+college);
		}
public static void main(String[] args) {
	System.out.println("college");
	new static_modifier(1, "dsd");
	new static_modifier(2, "adsd");
	new static_modifier(3, "bdsd");
	new static_modifier(4, "cdsd");
}
		
	

}
