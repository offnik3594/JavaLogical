package numbers;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Entr ypur Count");
		int count=sc.nextInt();
		sc.close();
		int num1=0,num2=1,num3;
		
		for(int i=0;i<=count;i++)
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num3);
		}
		
		
		
	}

}
