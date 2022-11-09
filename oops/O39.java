package oops;
class Member{
	String name;
	int age;
	int phoneno;
	String address;
	int salary;

public void printsalary(){
	System.out.println(salary);
}
}

class employee extends Member{
	String specialization ;

	
}
class manager extends Member{
	String department;
	
}

public class O39 {
	public static void main(String[] args) {
		employee e=new employee();
		e.name="riya";
		e.age=21;
		e.address="vadodara";
		e.phoneno=98233343;
		e.salary=6000;
		e.specialization="IT";
		System.out.println(e.address +e.age +e.name +e.phoneno +e.salary);
		
		manager m=new manager();
		m.department="eme";
		System.out.println();
		
	}
	

}
