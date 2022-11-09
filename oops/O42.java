package oops;


public class O42 {
	public static void main(String[] args) {
		
	}
}
	
class number{
	public final double real;
	public final double i;
	
	public number(double real,double i) {
		this.real=real;
		this.i=i;
	}
	public number sum(number other) {
		double r=this.real+other.real;
		double i=this.real+other.i;
		return new number(r,i);		
	}
	public number diff(number other) {
		double r=this.real-other.real;
		double i=this.real-other.i;
		return new number(r,i);		
	}
	public double getReal() {
	    return real;
	  }
	public double getImaginary() 
	{ 
		return getImaginary(); 
	} 
	@Override
	public String toString() 
	{
		return real + " + " + getImaginary() + "i";
		} 
	}


