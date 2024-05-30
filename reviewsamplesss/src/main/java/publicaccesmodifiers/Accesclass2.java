package publicaccesmodifiers;

public class Accesclass2  extends Acessclass1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accesclass2 p = new Accesclass2();
		p.add();
		//p.sub();//private method not access
		p.multi();
		p.div();//default
	}

}
