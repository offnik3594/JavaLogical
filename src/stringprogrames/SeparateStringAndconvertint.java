package stringprogrames;

import java.util.ArrayList;
import java.util.List;

public class SeparateStringAndconvertint {
//convert string into int
	public static void main(String[] args) {
		
		String n="Nikhil@143";
		
		String [] n1=n.split("@");
	
		int number=Integer.parseInt(n1[1]);
		System.out.println(number);
		
		
	}

}
