package oops;

public class EncapsulationImpl {

 
	   public static void main(String[] args) {
	      EncapsulationEx ee = new EncapsulationEx();
	      ee.setName("ABC");
	      ee.setPercentage(68.3f);
	      ee.setScore(24);
	      System.out.println(ee.getName());
	      System.out.println(ee.getPercentage());
	      System.out.println(ee.getScore());
	   }
}