package arrayProg.copy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Dulicateinarray {

	public static void main(String[] args) {
		
		String a []= {"stella","shambhu","nikhil","niket","stella","shambhu"};
		
		Set <String> s=new HashSet<>();
		
		for(String o:a)
		{
	
			if(s.add(o))//show duplicat value=false
				               //remover duplicate value =true
			{
				System.out.println(o);
			}
		}
		
		
		
		
//        String a []= {"stella","shambhu","nikhil","niket","stella","shambhu"};
//		
//		Set<String> ch=new HashSet<String>();
//		
//		for(int i=0;i<a.length;i++)
//		{
//			ch.add(a[i]);
//		}
//		
//		System.out.println(ch);
//		
		
		
		
		
		
	}

}
