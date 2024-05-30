package interfacemultiple;

public class Mulclass3 implements Mulclass1,Mulclass2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mulclass3 c = new Mulclass3();
		c.display();
		c.disp();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("multiple inheritance");
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("methods in java");
	}

}
