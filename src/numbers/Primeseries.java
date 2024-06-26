package numbers;

import java.util.Scanner;

public class Primeseries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter count");
		int count=sc.nextInt();
		sc.close();
		int temp=0;
		
		for(int i=2;i<count;i++)
		{
			for(int j=2;j<i-1;i++)
			{
				if(i%j==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println("Prime number" +i);
			}
			else
			{
				temp=0;
			}
			
		}
		
		
		
		
	
	
	
	
	
	
	
	
	
	}

}
