package samplecollections;

import java.util.ArrayList;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Integer> o = new ArrayList <Integer>();
o.add(5);
o.add(8);
o.add(7);
System.out.println(o);
o.remove(2);
System.out.println(o);    
System.out.println(o.size());
o.addAll(o);
System.out.println(o);
System.out.println(o.contains(7));
System.out.println(o.get(1));

	}

}
