package abstraction;

public class Aclass2 extends Aclass1 {
	public void run()
	{
		System.out.println("methodd");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aclass2  o = new Aclass2();
		o.run();
		o.disp();
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println(" abstract methodd");
	}

}
