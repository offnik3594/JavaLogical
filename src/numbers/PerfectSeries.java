package numbers;

import java.util.Scanner;

public class PerfectSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter count");
		int count=sc.nextInt();
		sc.close();
		int sum=0;
		
		for(int i=1;i<=count;i++)
		{
			for(int j=1;j<i;i++)
			{
				
				if(i%j==0)
				{
					sum=sum+j;
				}
				
		    }
			if (sum==i)
			{
				System.out.println(i);
			}
			
				
		}
		

	}

}
