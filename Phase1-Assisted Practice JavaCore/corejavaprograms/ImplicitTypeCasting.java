package corejavaprograms;

public class ImplicitTypeCasting {

	public static void main(String[] args) {
		
		byte byteValue=50;
		
		//converting byte to short
		
		short shortValue=byteValue;
		
		//declaring integer variable
		
		int intValue= shortValue;
		
		//converting into Double(Type casting)
		
		long longValue=intValue;
		
		//converting long to float
		
		float floatValue=longValue;
		
		System.out.println("Before converting byte value"+ byteValue);
		System.out.println("After conversion longvalue"+ shortValue);
		System.out.println("After convertion int value"+ intValue);
		System.out.println("After conversion longvalue"+ longValue);
		System.out.println("After conversion float value"+ floatValue);

	}

}
