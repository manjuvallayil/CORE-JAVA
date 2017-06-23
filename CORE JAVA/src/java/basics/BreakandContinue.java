package java.basics;

public class BreakandContinue 
{
	
	public static void main(String[] args)
	{
	// break example
		for(int i=0;i<10;i++)
		{
			if(i==5)
				break; // when condition satisfies it will exit the loop
			
			System.out.println("Break Result: "+i);
			// it will print up to 4 only, when i==5, break will run and exit loop
		}
		
	// continue example
		
		for(int j=0;j<=10;j++)
		{
			if(j>=5&&j<=8)
				continue;  // for 5,6,7and 8 loop will go back to j++ -> iteration
			
			// continue statement means if the condition satisfies the loop will go back to iteration
			
			System.out.println("Continue Result: "+j);
			
		}
	}

}
