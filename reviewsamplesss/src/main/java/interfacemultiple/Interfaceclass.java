package interfacemultiple;

public class Interfaceclass  implements Mulclass1{
	public void run()
	{
	System.out.println("methods");
	}

	public static void main(String[] args) {  // Mulclass= interface
		//Interfaceclass=class name
		// TODO Auto-generated method stub
		Mulclass1 o = new Interfaceclass();//interface class obj creation
		o.disp();
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("methods in class");
		
	}

}
