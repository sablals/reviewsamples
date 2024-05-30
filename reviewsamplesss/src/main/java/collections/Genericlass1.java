package collections;
import java.util.*;

public class Genericlass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> obj = new ArrayList <Integer>();
		obj.add(7);
		obj.add(9);
	    obj.add(10);
	    System.out.println(obj);
	    obj.remove(2);
	    System.out.println(obj);
	    System.out.println(obj.size());
	    obj.addAll(obj);
	    System.out.println(obj);
	    System.out.println(obj.contains(9));
	    System.out.println(obj.get(1));

}
}