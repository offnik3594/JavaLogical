package arrayProg.copy;

public class Maxandminvalue {

	public static void main(String[] args) {
		int [] a= {10,20,30,40,50,60,70,80,90,100};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max =a[i];
			}
			
			
		}
		System.out.println(max);
		
		
		int min=a[0];
		
		
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min =a[i];
			}
			
			
		}
		System.out.println(min);
		
		
		
	}

}
