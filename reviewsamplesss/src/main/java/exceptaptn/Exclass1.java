package exceptaptn;

public class Exclass1 {
	int a=10;
	int div;
	public void print() {
		try
		{
	    div = a/0;//exception code
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception handled");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exclass1 o = new Exclass1();
		o.print();
	}

}
