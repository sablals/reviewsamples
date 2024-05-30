package additions;

public class Additionss extends Addition  {
	int c ;
	double divi;
	public void result(double d)
	{
		divi=d;
		System.out.println(super.add(10,5));
		double divi = c%10;
		System.out.println("Divisible by 10");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition i = new Addition();
		Additionss o = new Additionss();
		i.add(10,5);
		o.result(15.000d);
	}

}
