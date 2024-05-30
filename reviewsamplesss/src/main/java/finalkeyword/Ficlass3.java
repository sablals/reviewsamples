package finalkeyword;

public class Ficlass3 extends Ficlass2 {
//public final void run()//cannote ovveride final methods
{
	System.out.println("final methods");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ficlass3  o = new Ficlass3();
		o.run();//possible in extends final
	}

}
