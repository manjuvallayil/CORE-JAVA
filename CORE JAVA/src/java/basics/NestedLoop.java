package java.basics;

public class NestedLoop {

	public static void main(String[] args) {
		
	
		int count = 0;  // to know the number of runs
		for (int i=0; i<3; i++)
			
		{
			int j=0;
			while(j<4)
			{
				int k=0;  // importance in where to declare this variable
				do
				{
					
					System.out.println("i:"+i+"  j:"+j+"  k:"+k);
					k++;
					count++;
				}while(k<5);
				
				j++;  // part of while loop
			}
		}
		System.out.println("Number of runs:"+count);
	}
	}
