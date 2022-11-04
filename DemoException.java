package exception;

public class DemoException {

	public static void main(String[] args) {

		int i, j, k = 0;
		int a[] = new int[4];
		i = 9;
		j = 0;
		try {
			// k=i/j;
			for (int o = 0; o <= 4; o++) {
				a[o] = o + 1;
			}
			for (int value : a) {
				System.out.println(value);
			}
		} 
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("maximum number value is 4");
		}
		catch(Exception e) {
			System.out.println("unknown exception");
		}
		System.out.println(k);
		// System.out.println(a);
	}

}
