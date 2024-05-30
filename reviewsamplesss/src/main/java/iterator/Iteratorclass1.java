package iterator;
import java.util.*;
public class Iteratorclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <Integer> o = new ArrayList<Integer>();
o.add(9);
o.add(11);
o.add(5);
System.out.println(o);
for(Integer a: o)
System.out.println(a);
Iterator k = o.iterator();
while(k.hasNext())
{
	System.out.println(k.next());
	}

}
}
