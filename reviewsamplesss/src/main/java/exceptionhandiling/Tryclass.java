package exceptionhandiling;

public class Tryclass {
	int a=10;
	int div;
public void run()
{
	//try
  //{
	  div= a/0;
  //}
	//catch(Exception e)
	//{
		System.out.println("Arthimetic exeception");
	//}
}
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Tryclass c = new Tryclass();
	  c.run();
  }
	}


