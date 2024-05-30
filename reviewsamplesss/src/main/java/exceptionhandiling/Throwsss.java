package exceptionhandiling;

public class Throwsss {
	int a;
	public void disp( )
	{	
	if(a>18)
	{
		System.out.println("you are eligible");
	}
	else
	{
		System.out.println("you are not eligible");	
		//throw new ArithmeticException("exception");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throwsss  e = new Throwsss ();
		e.disp();
	}
	}


