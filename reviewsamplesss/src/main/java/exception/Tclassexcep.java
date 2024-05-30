package exception;

public class Tclassexcep {
	int a=10;
	int div;
	int [] n= {1,2,3,4};
	public void run() {
	try
	{
		div = a/0;
		int c= n[4];
	}
	catch( ArithmeticException e)
	{
		System.out.println("exception handled");
	}
	catch(Exception v)
	{
		System.out.println(" array exception handled");
	}
	finally
	{
		System.out.println("  exception updated");	
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tclassexcep i = new Tclassexcep();
		i.run();
	}

}
