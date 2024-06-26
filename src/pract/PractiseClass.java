package pract;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PractiseClass {
// prime
	public static void main(String[] args) {
       String name="sssss kkkkk ddddd";
		
		Set<Character> c=new HashSet<>();
		
		for(int i=0;i<name.length();i++)
		{
		    c.add(name.charAt(i));
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(char ch:c)
		{
		    sb.append(ch);
		}
		
		System.out.println(sb);
		
		
		
		
	}

}
