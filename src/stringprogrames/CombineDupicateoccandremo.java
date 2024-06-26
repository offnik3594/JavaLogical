package stringprogrames;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CombineDupicateoccandremo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String v=sc.nextLine();
		sc.close();
		
		System.out.println("Before Removing dupicate  character"+"  "+v);
		
		int ch[]=new int[256];
		
	for(int i=0;i<v.length();i++)
	{
		ch[v.charAt(i)]++;
	}
	
	for(char i=0;i<256;i++)
	{
		if(ch[i]>1)
		{
			System.out.println(i +" =>"+ch[i]);
		}
	}
	
	
	Set<Character> s=new HashSet<Character>();
	
	for(int i=0;i<v.length();i++)
	{
		s.add(v.charAt(i));
	}
	
	StringBuilder b=new StringBuilder();
	for(char c:s)
	{
		b.append(c);
	}
	System.out.println("After Removing dupicate  character"+"  "+b);

	}

}
