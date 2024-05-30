package samplecollections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Linked1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> o =new LinkedList<String>();
		//Set<String> o =new ArrayList<String>();
		o.add("devu");
		o.add("malu");
		//System.out.println(o);
		Iterator k = o.iterator();
		while(k.hasNext())
		{
			System.out.println(k.next());
		}	
	}

}
