package throw_and_throws;

public class ThrowsExample {

		static void checkAge(int age) throws ArithmeticException {
			
			    if (age < 18) {
			      throw new ArithmeticException("you are not eligible try after 18...");
			    }
			    else {
			      System.out.println("You are eligible");
			    }
			  }

			  public static void main(String[] args) {
			    checkAge(15);
			  }
			
	

}
