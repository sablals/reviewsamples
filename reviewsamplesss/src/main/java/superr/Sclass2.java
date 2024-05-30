package superr;

public class Sclass2 extends  Sclass1 {
	public void dispp()
	{
		System.out.println(super.name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sclass2 f = new Sclass2();
		f.print();
		f.dispp();
	}

}
