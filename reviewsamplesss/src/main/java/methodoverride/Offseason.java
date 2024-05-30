package methodoverride;

public class Offseason extends Onseason {
	public Offseason()
	{
		double discouts=0.15;
	}
	public void disct()
	{
		super.disct();
		  System.out.println("Discount of offseason 15%");	  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Offseason c = new Offseason();
		c.disct();
	}

}
