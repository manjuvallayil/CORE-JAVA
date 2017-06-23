package java.basics;

// methods need to be declare and define


public class LearningMethods {

	
	
	// method that returns integer value
	public int ReturnInt()   //declaration
	{
	// defining this method
		
	return 10; // should include this int return statement as the last statement of this method
	}
	
	// method that returns string value
	public String ReturnString(int a, int b, String c)
	{
		return "Hello"; // should write this String return statement as the last statement of this method
	// only one return statement
	}
	
	//
	public void ReturnNothing()
	{
	
		// No need of return statement for void method since it is returning nothing
	}
	
	// Calling a method 
	public static void main(String[] args)
	{
	LearningMethods LM = new LearningMethods(); // object created
	LM.ReturnInt(); // method called
	int a = 0;
	int b = 0;
	String c = "Hi";
	LM.ReturnString(a, b, c); // method with parameter called
	LearningMethods LM1 = new LearningMethods();
	LM1.ReturnInt(); // another object called the same method
	
	/* THE METHODS AND INSTANCE VARIABLES CAN BE ACCESSED BY 
	 * RFERENCE VARIABLE.(DOT OPARATER)INSTANCE VARIABLE / METHOD
	 */
	// calling variables of another class 'Variables'
	
	Variables V1 = new Variables(); 
	V1.i++;      // the value of i is 11
	
	Variables V2 = new Variables();
	V2.i++;  // value of i is again 10 + 1 = 11
	System.out.println(V2.i);  // to print i call object reference variable.i
	
	new Variables(); 
	Variables.j++;      // the value of j is 51
	
	new Variables();
	Variables.j++;   // the value of j is 51+1=52 since it is a class variable
	System.out.println(Variables.j);  // to print i call object reference variable.i
	
	// CALLING METHODS FROM CLASS 'EXERCISE'
	
	Exercise1 Sum1 = new Exercise1();
	{
		int x = Sum1.getSum(10, 15);
		System.out.println("The result of Addition is: " +x);
	}
	Exercise1 Sub1 = new Exercise1();
	{
		int y = Sub1.getSub(10,5);
		System.out.println("The result of Subtration is:" +y);
	}
	Exercise1 Mul1 = new Exercise1();
	{
		int z = Mul1.getMul(10, 7);
		System.out.println("The result of Multiplication is:" +z);
	}
	Exercise1 Div1 = new Exercise1();
	{
		int z1 = Div1.getDiv(10, 5);
		System.out.println("The result of Division is:" +z1);
	}
	// CALLING ALL METHODS WITH ONE OBJECT
	
	Exercise1 Calc = new Exercise1();
	{
		int x = Calc.getSum(10, 5);
		System.out.println("The result is:" +x);  // String plus int variable to print
		
		// printing results
		System.out.println(Calc.getSub(10,5));
		System.out.println(Calc.getMul(10, 5));
		System.out.println(Calc.getDiv(10, 5));
	}
	
	
	}
	}
	
	


