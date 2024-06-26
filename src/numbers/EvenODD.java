package numbers;

import java.util.Scanner;

public class EvenODD {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num = Sc.nextInt();
		Sc.close();
		
		if(num%2==0)
		{
			System.out.println("given num is even");
		}
		else
		{
			System.out.println("given num odd");
		}
		
		
	}

}
