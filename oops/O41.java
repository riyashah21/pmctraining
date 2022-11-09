package oops;
class area{
	int area;
	area(int a,int b){
		area=(a*b)/2;
	}
}
class perimeter{
	int perimeter;
	perimeter(int a,int b,int c){
		perimeter=a+b+c;
	}

}

public class O41 {
	public static void main(String[] args) {
		
		area A1=new area(3,4);
		System.out.println("area of triangle:" +A1.area);
		perimeter p1=new perimeter(3,4,5);
		System.out.println("periemter of triangle: " +p1.perimeter);
	
	
	
	}
	
}
