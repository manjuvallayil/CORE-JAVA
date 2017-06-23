package java.intermediate;

/*
 * POLYMORPHISM MEANS MULTIPLE BEHAVIOUR
 * 2 TYPES
 * METHOD OVERLOADING - COMPILE TIME Polymorphism
 * METHOD OVERRIDING - RUN TIME Polymorphism
 * 
 * Definition - In a single class there will be more than one methods with same name
 * but different behaviors
 */
public class PolymorphismOverloading {
	
	
	void guessAnimal()   // method name guessAnimal, with no parameters
	{
		System.out.println("Snake");
	}
	void guessAnimal(int i) // same method name with 1 parameter
	{
		System.out.println("Animals with " +i+ " legs");
	}
	void guessAnimal(int j, String S) // same method name with 2 parameters
	{
		System.out.println("Animals with " +j+ " legs and a " +S);
	}
	public static void main(String[] args) {
		
		PolymorphismOverloading PO = new PolymorphismOverloading();
		
		// calling all methods with arguments, passing arguments is critical here
		PO.guessAnimal();
		PO.guessAnimal(2);
		PO.guessAnimal(2, "tail");
		
	}

}
