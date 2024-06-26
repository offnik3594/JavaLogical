
package numbers;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter yor num");
		int num=sc.nextInt();
		sc.close();
		int a,temp,sumofcube=0;
		temp=num;
		while(num!=0)
		{
			a=num%10;
			temp=num/10;
			sumofcube=sumofcube+(a*a*a);
			
		}
		if(num==sumofcube)
		{
			
			System.out.println(num +"Armstrong num ");
			
		}
		else
		{
			System.out.println(num +"not Armstrong num ");
		}
		
		
		
		
		
		
	}

}
