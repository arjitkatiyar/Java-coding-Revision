public class Hello{
	
	//variable 3 types local , instance and static 
	
	
	//Instance Variable (Inside the class but outside of method or any block
	
	int newNumber = 100; //instance variable //object variable
	
	static int newNumber1 = 200; //static variable //class Variable
	
	
	{
	//SIB
		int num1 = 100; //local variables
		System.out.println(num1);
	}
	

	public static void main(String[] args) {
				//Variables
						int num1 = 10; //goodpractice of variables
						int num2 = 20; //local variable
						
						System.out.println(num1 + " " + num2);
			
						Hello obj = new Hello();
						
						System.out.println(obj.newNumber);
						System.out.println(newNumber1);
						
						
						
	}

}