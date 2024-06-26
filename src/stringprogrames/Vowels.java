package stringprogrames;

public class Vowels {
//vowells present in string
//vowells count
//cosonent count
	public static void main(String[] args) {
		String n="My name is nikhil shankar kadam";
		String s=n.toLowerCase();
		int tcc=0;
		int vc=0;
		
		int [] ch=new int[256];
		
		
		for(int i=0;i<s.length();i++)
		{
			ch[(int)s.charAt(i)]++;
			char c= s.charAt(i);
			 
			if(c!=' ')
			  {
				  tcc++;
			  }
			if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u')
			{
				vc++;	
			}
				
		}
		for(char j=0;j<256;j++)
		{
			if(ch[j]!=0)
			{
			   if(j=='a' || j=='e'||j=='i'||j=='o'||j=='u')
			  {
			 	System.out.println(j+"=>"+ch[j]);
			  }
			}
		}
		
		System.out.println("Total ccharacter "+tcc);
		System.out.println("vowels "+vc);
		System.out.println("Consonant "+(tcc-vc));
		
	}

}
