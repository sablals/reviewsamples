package polymorphism;

public class Polym2 extends Polym1

 {
	public void disp()
	{
		super.disp();
		System.out.println("polymoripsm in methods");
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polym2 v= new Polym2();
		v.disp();
	}

}
