package java.intermediate;

// SAME METHOD NAME IN PARENT CLASS AND IN INHERITED CLASS
// OBJECT OF THE CHILD CLASS(ch here) CAN ACCESS THE METHOD (eat here), IF CHILD CLASS HAVE THAT METHOD, THEN IT WILL BE EXECUTED
// OTHERWISE THE PARENT CLASS METHOD WILL BE EXECUTED

public class OverridingParent 
{
	 public void eat()   // same method name in parent class and sub class
	{
		System.out.println("Parent class Executed");
	}
	

	

  public static class child extends OverridingParent
{
	public void eat()    // same method name in parent class and sub class
	// if change this method name to eg: eat1() then result printed will be "Child class executed"
	
	{
		System.out.println("Child class executed");
	} 
	  
	
	

	}


  public  static void main(String[] args) {
	child ch = new child();
	
		 ch.eat();
		
		 
		 
	 }
	

	
}