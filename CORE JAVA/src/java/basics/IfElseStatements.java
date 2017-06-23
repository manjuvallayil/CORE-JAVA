package java.basics;

public class IfElseStatements {

public static void main(String[] args)
{
	int num = (int) (Math.random()*20);
	System.out.println(num);
	
	if(num>10)
	
		System.out.println("The number is greater than 10");
	
	else if(num==10)
		System.out.println("The number is equal to 10");
	
	else if(num<10 && num>5)  // notice condition
		System.out.println("The number is between 5 and 10");
	
	else 
		System.out.println("The number is less than 10");
}

}
