package excelfilesreading;

import java.io.IOException;

public class Excelclass2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String r= Excelclass1.getStringData(1,1);
		System.out.println(r);
		String n= Excelclass1.getIntegerData(1,0);
		System.out.println(n);
	}

}
