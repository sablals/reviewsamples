package samplecollections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listtoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>fruitList=new ArrayList<>();
fruitList.add("mango");
fruitList.add("orange");
fruitList.add("grape");
String[] array = fruitList.toArray(new String[fruitList.size()]);
System.out.println("printing"+ Arrays.toString(array));
System.out.println(fruitList);
	}

}
