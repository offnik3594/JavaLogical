package arrayProg.copy;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class dupliintarr {

	public static void main(String[] args) {
		
		int  [] c= {1,2,3,4,4,5,5,6,6,6,7,8,9,12,13,10};
		
		Arrays.sort(c);
		
		
		Set<Integer> ch=new HashSet<Integer>();
		
		for(int i=0;i<c.length;i++)
		{
			ch.add(c[i]);
		}
		
		System.out.println(ch);
		
		
		
		
	}
	}
