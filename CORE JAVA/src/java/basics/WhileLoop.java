package java.basics;

// loops are not statements so with a semicolon at the end, the loop will not work but it exit
// entry criteria --> loop condition must be true here in this eg, i<=100
// exit criteria --> loop condition must be false, when i>100


public class WhileLoop {

	public static void main(String[] args) {
		
		int i=1;
		
		while(i<=100)
		{
		System.out.println(i);	
		
		i++;
		}
		}

}
