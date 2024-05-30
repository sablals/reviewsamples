package singleinheritance;

public class Class2 extends Class1 {
	int a=10;
	int b= 5;
	public void display()
	{
	int c= a+b;
	System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2 o = new Class2();
		o.display();
		o.print();
	}

}
