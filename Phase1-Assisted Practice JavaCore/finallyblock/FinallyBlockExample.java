package finallyblock;

public class FinallyBlockExample {

	public static void main(String[] args) {
		
		try {
			
			int[] array=new int[10];
			System.out.println(array[20]);
		
		}
		catch(Exception e) {
			System.out.println("Exception occured");
		}
		finally {
			System.out.println("Plaese check the code once ");
		}
	}

}
