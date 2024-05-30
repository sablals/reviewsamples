package multilevelinheritance;

public class Mulclass3  extends Mulclass2{
	public void disp()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mulclass3 v = new Mulclass3();
		v.disp();
		v.print();
		v.display();
	}

}
