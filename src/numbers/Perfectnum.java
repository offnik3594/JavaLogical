package numbers;

import java.util.Scanner;

public class Perfectnum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr count");
		int num=sc.nextInt();
		sc.close();
		int sum=0;
		
		for(int i=1;i<num;i++)
			if(num%i==0)
			{
				sum=sum+i;
				
			}
		if(sum==num)
			{
			System.out.println("Givem num is perfect");
			}
		else
			System.out.println("Givem num is not perfect");
			
	
	}

	}


