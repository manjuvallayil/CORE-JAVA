package java.basics;

public class DoWhile {

	public static void main(String[] args) {
		
		int i=0;
		int j=0;
		int[] myArray = {9,18,7,6,65,4};
		 
		 
		 do    // whatever may the while condition the first block of code inside do will work
		 {
			 System.out.println(i);
			 i++;
		 }
		 while(i<=10); // notice the use of ; here in do while loop
		
		 System.out.println("Loop terminated");
		 for (i=0; i<6; i++){
			 System.out.println("Array element is: " + myArray[i]);
		 }
		 
		 int max = myArray[j];
		 for (j=0; j<5; j++){
		 if (max<myArray[j]) 
			 max=myArray[j];
		 
		 }
		 
		 System.out.println("The greatest number in this array is: " +max);
	
	}

}
