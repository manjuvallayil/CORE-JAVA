package java.basics;

public class Exercise1 {
	
	// MY STYLE
	public int doAdd()
	{
		int i = 10; // declared variables inside body
		int j = 11;
		int k = i+j;
		return k;	
	}
		public int doSub(int l,int m) // variables as parameters

	{	
		
		return l-m;
	}
	
	public int doMul()
	{
		int o = 10;
		int p = 11;
		int q = o*p;
		return q;
	}
	public int doDiv()
	{
		int r = 10;
		int s = 11;
		int t = r/s;
		return t;
	}

	// TUTOR STYLE
	
	public int getSum(int num1, int num2)
	{
		return num1+num2;
		
	}
	public int getSub(int num1, int num2)
	{
		return num1-num2;
	}
	public int getMul(int num1, int num2)
	{
		return num1*num2;		
	}
	public int getDiv(int num1, int num2)
	{
		return num1/num2;
	}
}

