package corejavaprograms;

 class DefaultAccessSpecifier {
	 
	   void display() 
	      { 
	          System.out.println("You are using defalut access specifier"); 
	      } 


	 	public static void main(String[] args) {
	 		//default
	 		System.out.println("Dafault Access Specifier");
	 		DefaultAccessSpecifier das = new DefaultAccessSpecifier(); 		  
	         das.display(); 

	 	}
	 }



