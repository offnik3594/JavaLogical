package stringprogrames;



public class ReverseWordinString {

	public static void main(String[] args) {
		String input="i m nikhil";
		
		
		String revin="";
		String[] words = input.split(" ");
		
		for(String Word:words)
		{
			String revword="";
		for(int i=Word.length()-1;i>=0;i--)
		{
			revword=revword+Word.charAt(i);
		
		}
		revin=revin+revword+" ";
		
		}
		System.out.println(revin);
		

}
}
