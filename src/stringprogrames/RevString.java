package stringprogrames;

public class RevString {

	public static void main(String[] args) {
		String input="i am nikhil";
		String rev="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			
			rev=rev+input.charAt(i);
		}
		System.out.println(rev);
		
	}

}
