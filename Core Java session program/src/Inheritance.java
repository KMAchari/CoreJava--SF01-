
 public class Inheritance {
	
	
	private void printName() 
	{
		System.out.println("Value-A");
		
	}
	

}
class B extends Inheritance{
	void printName()
	{
		System.out.println("Name-B");
		
	}
}

 class Test
 {
	 public static void main(String[] args) 
	 {
		 B b = new B();
		   b.printName();
	 }
 
 }
	
