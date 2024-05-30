package interfacemultiple;

public class Mulclassinter1 implements Mulclassa1inter  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mulclassinter1 o = new Mulclassinter1();
		o.disp();
		o.display();
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("methods");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(" multiple interface methods");
	}

}
