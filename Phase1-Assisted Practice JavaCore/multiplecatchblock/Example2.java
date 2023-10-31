package multiplecatchblock;

public class Example2 {

	public static void main(String[] args) {
		try {
			try {
				int a=10/0;
				
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmatic");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index exception");
			}
		}
		catch(Exception e) {
			System.out.println("Exception other");
		}
			

	}

}
