package Hierachicalinheritance;

public class Hiclass3 extends Hiclass1 {
	int a= 19;
	public void display()
	{
		System.out.println(a);
		System.out.println("herichical inheritance are");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hiclass3 o = new Hiclass3();
		o.display();
		o.dispp();
	}

}
