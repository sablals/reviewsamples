package Hierachicalinheritance;

public class Hiclass2 extends Hiclass1{
	int a=8;
	int b =23;
	public void print()
	{
   int c = a+b;
   System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hiclass2  o = new Hiclass2 ();
		o.print();
		o.dispp();
	}

}
