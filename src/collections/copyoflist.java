package collections;

import java.util.ArrayList;
import java.util.List;

public class copyoflist {

	public static void main(String[] args) {
	
		List<Integer> l=new ArrayList<Integer>();
		l.add(0, 1);
		l.add(1, 2);
		l.add(2, 3);
		l.add(3, 4);
		l.add(4, 5);
    
		
		System.out.println(l);
		
	
		
		//copy
		
		List<Integer> l2=new ArrayList<Integer>();
		l2.addAll(l);
		
		System.out.println(l2);
		
		
	}

}
