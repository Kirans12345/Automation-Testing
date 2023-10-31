package corejavaprograms;

public class ExplicitTypeCasting {

	public static void main(String[] args) {
		
		double doubleValue=30.333;
		
		//converting double to float 
		
		float floatValue=(float) doubleValue;
		
		//converting float  to long 
		
		long longValue=(long) floatValue;
		
		//converting long to int 
		
		int intValue=(int) longValue;
		
		//converting int  to short
		
		short shortValue=(short) intValue;
		
		//converting short to byte 
		
		byte byteValue=(byte) shortValue;
		
		System.out.println("before conversion : "+doubleValue);
		System.out.println("After conversion : "+floatValue);
		System.out.println("After conversion : "+longValue);
		System.out.println("After conversion : "+intValue);
		System.out.println("After conversion : "+shortValue);

		
		
	}

}
