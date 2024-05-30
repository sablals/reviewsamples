package suprmethod;

public class Smclass2 extends Smclass1 {
	double div;
	int c;
	public void disp() {
	System.out.println(super.print(10,15));
	div =c%10;
	System.out.println("no is divisible by 10");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smclass2 g = new Smclass2();
		g.disp();
	}

}
