package java.basics;

public class RandomNumbers {

	public static void main(String[] args) {
		
		double x = Math.random(); // 'random' is a method defined in Math class in Java library
		// so those methods can be  called directly without creating object of the class
		System.out.println(x);
	
		double y = Math.random()*10; // manipulated the random number by multiplying with 10
	
		System.out.println(y);
		
		int z = (int) (Math.random()*5);  // type casted to integer to avoid long value
		// remember to put () both for int and for rest of the line
		System.out.println(z);
		
		double z1 = (int) (Math.random()*100);  // result is double with point zero extension
		System.out.println(z1);
	}

}
