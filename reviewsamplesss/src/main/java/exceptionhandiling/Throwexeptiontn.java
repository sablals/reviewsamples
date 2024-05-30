package exceptionhandiling;

public class Throwexeptiontn {
		int a;
		public void disp( int b)
		{
		a=b;	
		if(a>18)
		{
			System.out.println("you are eligible");
		}
		else
		{
			//System.out.println("you are not eligible");	
			throw new ArithmeticException("exception");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throwexeptiontn e = new Throwexeptiontn();
		e.disp(4);
}
}