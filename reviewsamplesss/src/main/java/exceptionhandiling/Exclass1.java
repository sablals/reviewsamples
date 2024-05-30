package exceptionhandiling;

public class Exclass1 {
	int a=10;
	int div;
	public void print()throws ArithmeticException
	{
	try
	{
	div = a/0;	
     }
	catch(ArithmeticException v)
	{
	System.out.println("Arithmeticc exceptn");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exclass1  c = new Exclass1();
		c.print();
	}

}
