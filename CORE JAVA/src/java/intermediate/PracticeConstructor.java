package java.intermediate;

public class PracticeConstructor {
	
	int model;
	int kms;
	String make;
	String brand;
	boolean islefthanded;
	boolean isrighthanded;
	
	public PracticeConstructor(String S, boolean b, int k){
		S = brand;
		b= isrighthanded;
		k= kms;
	}
	public void method1(){
		System.out.println("The car specification is: " +brand+", Righthanded?-- "+isrighthanded+" and drew "+kms+ " kilometers.");
			
	}

	public static void main(String[] args) {
		
PracticeConstructor Car = new PracticeConstructor("BMW", false, 1000);
Car.method1();


	}

}
