package multiplecatchblock;

public class MultipleCatchBlockexample {

	public static void main(String[] args) {
		
		try {
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmatic exception");
		}
		catch(Exception e) {
			System.out.println("Other exceptions");
		}

	}

}
