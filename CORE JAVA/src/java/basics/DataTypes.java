package java.basics;

public class DataTypes {

	public static void main(String[] args) {
		
		// Data Types - declaration (int i;) and initialization (i=5;)
		int i = 1234;  // can store up to 10 digits
		long l = 1234567890123l; // can store long integers needed to be suffix with l at the end
		float f = 1.234f;  // always need the suffix f in the end
		double d = 1.2345678901234567890; // can store long float values without suffix
		boolean b = true; // will store either true of false
		char c = 'a'; // stores only single character - should be inside quotes
		String s = "This is a Java Tutorial"; // should be inside double quote
		
		
System.out.println(s);

// Concatenated String
String s1 = "Way";
String s2 = "2";
String s3 = "Automation";
String s4 = s1+s2+s3;
// below both are correct
System.out.println(s4);
System.out.println(s1+s2+s3);

// Integer
int num1 = 10;
int num2= 15;
System.out.println(num1+num2+ "added"); 
// entire data would be concatenated as string ->result - before1015after
System.out.println("before" + num1+num2+ "after");
//integers added ->before25after
System.out.println("before" +(num1+num2)+"after");

/* Operators
Unary operators (only single operand)
increment ++, decrement --, logical compliment operator!
Binary operators (two operands)-> Arithmetic Operators -> +, -, *, /, %
Equality and relational operators -> ==, !=, <, >, <=, >= (result will be always either true or false)
Conditional operators -> Conditional AND (&&), Conditional OR (||), Ternary Operator (?:)  
&& - result will be true only if both the conditions are true
|| - result will be true if any of the condition is true
*/
//Equality/relational operators result -> false
System.out.println(34==78);
//Conditional operators result -> true
System.out.println((34==34) && (23==23));
	}

}
