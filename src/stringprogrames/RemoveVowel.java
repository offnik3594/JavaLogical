package stringprogrames;

public class RemoveVowel {

	public static void main(String[] args) {
		String n="My name is nikhil i am softeare engineer";
		
		for(int i=0;i<n.length();i++)
		{
			char c=n.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				continue;
			}
			else
			{
				System.out.print(c);
			}
		}
		

	}

}
