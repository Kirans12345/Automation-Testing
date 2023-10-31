package exceptionhandling;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("The result is "+ c);
		}
		catch(ArithmeticException e){
			System.out.println("The exception catched");
		}
		System.out.println("Try catch ended");
	}
	


}
