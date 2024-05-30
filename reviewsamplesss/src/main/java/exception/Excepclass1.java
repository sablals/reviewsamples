package exception;

public class Excepclass1 {
int a;
public void run(int b)
{
a=b;
if(a>18)
{
	System.out.println("you are eligible");
}
else
{
throw new ArithmeticException("exceptions");
}
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Excepclass1 e = new Excepclass1();
	e.run(19);
}
}