package java.basics;

public class MethodCalling {

	// STATIC COMPONENET CAN DIRECTLY CALL STATIC COMPONENET ONLY NOT TO A NON STATIC COMPNT
	// BUT NON STATIC COMPONENET CAN DIRECTLY CALL STASTIC AND NON STATIC COMPONENTS, see EG below
	
	public static void main(String[] args) {
	
		//  go();    // can call go() method w/o object creation if it is a static method
	

	
	
		
	// IF THE GO METHODS WERE NOT STATIC THEN THE CODE HAD TO BE (calling through object)
	 
		MethodCalling m = new MethodCalling();
		m.go();
		
		go3();  // can call w/o object since go3() is a static method
		
	 
	
	}
	
	public void go()
	{
		System.out.println("go method");
		go1();  // non static method
		go3();  // EG: go3() is a static method and called by a non static method here
	
	}
	public  void go1()
	{
		System.out.println("go1 method");
		go2();
	}
	public  void go2()
	{
		System.out.println("go2 method");
	
	}
	
	public static void go3()    // static method 
	{
		System.out.println("go3 method");
	}
	
}
