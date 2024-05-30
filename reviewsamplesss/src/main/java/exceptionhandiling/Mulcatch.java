package exceptionhandiling;

public class Mulcatch {
	
		int a=10;
		int div;
		int [] num = {1,2,3,4,5};
		public void print()//throws IOException
		{
		try
		{
		int b=num[5];
		div = a/0;

		}
		catch(ArithmeticException v)
		{
	   System.out.println("Arithmetic exceptn");
		}
	  catch(ArrayIndexOutOfBoundsException u)
	  {
		System.out.println("Array index bound excetion");
	  }
	finally
	{
		System.out.println("exception handle");
	
		}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mulcatch c = new Mulcatch();
		c.print();
				
	}

}
