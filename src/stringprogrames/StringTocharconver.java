package stringprogrames;

import java.util.ArrayList;
import java.util.List;

public class StringTocharconver {

	public static void main(String[] args) {
        String a="nikhil@143";
		
		String [] ab=a.split("@");
		
		String s=ab[0];
		
		List<Character> l=new ArrayList<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			l.add(s.charAt(i));
		}
		
		for(char c:l)
		{
			System.out.println(c);
		}
		
		
	}

}
