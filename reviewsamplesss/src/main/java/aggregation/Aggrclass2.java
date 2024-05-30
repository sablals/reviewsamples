package aggregation;

public class Aggrclass2 {
	String house;
	int pinno;
	Aggrclass1 ei;
	public Aggrclass2(String house,int pinno,Aggrclass1 ei)
	{
		this.house= house;
		this.pinno= pinno;
		this.ei=ei;
	}
  public void sum()
  {
	  System.out.println(ei.name+" "+ei.age);
	  System.out.println(house+" "+pinno);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggrclass1 t = new Aggrclass1("malu",19);
		Aggrclass2 j =new Aggrclass2("sree",6,t);
		j.sum();
	}

}
