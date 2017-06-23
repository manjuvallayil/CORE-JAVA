package java.intermediate;


public class ArrayExercise { 
		
	
	public static void main(String[] args) {
		
	   String[] s1= {"Hi", "Hello", "How r u"};
	   int[] array = {1,2,3,4,5};
	   char[] carray = {'I','M', 'v','L'};
		printArray(s1);
		String[] myarray = returnArray();
		for(int i=0;i<myarray.length;i++){
			System.out.println("The returning array member at position "+i+ " is: " + myarray[i]);
		}
		
		// ENHANCED LOOP CODE FOLLOWS
		for(int i:array){
			System.out.println("Printing int array: "+i);
		}
		
		
		for (char letters: carray){
		
		System.out.println("Print char array: " +letters );
		}
		}
		// ENHANCE LOOP CODE ENDS
	
		public static void printArray (String[] arrayOne){
		for (int i=0; i<arrayOne.length; i++){	
			
		System.out.println("The array element at position " +i+ " is: " +arrayOne[i]);	
		}	
		
		}	
		
		public static String[] returnArray(){
			String[] s2 = {"A", "B", "C", "D"};
			// System.out.println("The returning array is: "+ s2[0]+" , "+s2[1]+" , "+s2[2]+" , "+s2[3]);
			return s2;
		}
		
	}

