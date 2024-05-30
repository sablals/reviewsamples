package iterator;

import java.lang.reflect.Array;
import java.util.*;
public class Listtoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <String> o = new ArrayList<String>();
o.add("ammu");
o.add("paru");
o.add("malu");
System.out.println(o);
String[] arr = o.toArray(new String[o.size()]);
//System.out.println("printing"+ Array.toString(arr));
System.out.println(o);
	}

}
