package throw_and_throws;

public class ThrowExample  {

			  static void checkAge(int age) {
				  
			    if (age < 18) {
			    	
			      throw new ArithmeticException("You are not eligible");
			      
			    }
			    else {
			    	
			      System.out.println("You are eligibled");
			      
			    }
			  }

			  public static void main(String[] args) {
			    checkAge(15); 
			  }
			
	

}
