package classoc;

//creating class

//A class is a blueprint from which individual objects are created.

public class ClassObjectConstructor {
	
	void display() {
		
		System.out.println("This is a method");
	}
	//Creating constructor
	
	public ClassObjectConstructor() {
		super();
	}

	public static void main(String[] args) {
		//Creating object
		
		ClassObjectConstructor coc=new ClassObjectConstructor();
		coc.display();

	}
}
