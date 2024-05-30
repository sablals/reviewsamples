package samplecollections;

import java.util.ArrayList;
import java.util.*;
public class Collections2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList o = new ArrayList();
o.add("joe");
o.add("ammu");
o.add("paru");
System.out.println(o);
o.remove(1);
System.out.println(o);
System.out.println(o.size());
o.addAll(o);
System.out.println(o);
System.out.println(o.contains("paru"));
String s1 = (String)o.get(0);
String s2 = (String)o.get(1);
String s3 = (String)o.get(2);
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
}

}
