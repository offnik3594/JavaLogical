package stringprogrames;

public class DevidestringIntopart {

	public static void main(String[] args) {
		String v="aaabbbccc";
		
		int l=v.length();
		int pl=l/3;
		
		String p1=v.substring(0, pl);
		
		String p2=v.substring(pl,2* pl);
		String p3=v.substring(2*pl);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		
			}

}
