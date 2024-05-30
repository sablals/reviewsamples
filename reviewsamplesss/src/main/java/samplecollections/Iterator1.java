package samplecollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <Integer> obj = new ArrayList<Integer>();
List<String> o =new ArrayList<String>();
obj.add(8);
obj.add(7);
obj.add(6);
System.out.println(obj);
o.add("devu");
o.add("malu");
System.out.println(o);
for(Integer a : obj)
System.out.println(a);
Iterator k = obj.iterator();
while(k.hasNext())
{
	System.out.println(k.next());
}
	}

}
