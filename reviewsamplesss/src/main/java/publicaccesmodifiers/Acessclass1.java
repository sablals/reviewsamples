package publicaccesmodifiers;

public class Acessclass1 {
	int a=10;
	int b=2;
	public void add()
	{
		int c=a+b;
		System.out.println(c);
	}
    private void sub()
    {
    	int d =a-b;
    	System.out.println(d);
    }
    protected void multi()
    {
    	int m =a*b;
    	System.out.println(m);
    }
    void div()//default
    {
    	int k =a/b;
    	System.out.println(k);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acessclass1 p = new Acessclass1();
		p.add();
		p.sub();
		p.multi();
		p.div();
	}
	}

