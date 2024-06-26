package stringprogrames;  
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatechar {
   public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your input");
	  String v=sc.nextLine();
	  sc.close();
	  
	  Set <Character> s=new HashSet<>();
	  
	  for(int i=0;i<v.length();i++)
	  {
		 s.add(v.charAt(i)); 
	  }
	   
	  StringBuilder sb=new StringBuilder();
	   
	  for(char c:s)
	  {
		  sb.append(c);
	  }
	   System.out.println(sb);
	   
}
}
