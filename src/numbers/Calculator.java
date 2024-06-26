package numbers;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First value");
		int v1=sc.nextInt();
		System.out.println("Enter arithmetic sign");
		String s=sc.next();
		System.out.println("Enter Second value");
		int v2=sc.nextInt();
		sc.close();
		int r;
		
		switch(s)
		{
		case("+"):r=v1+v2;
		System.out.println("Addition of given two num="+ r);
		break;
		case("-"):r=v1-v2;
		System.out.println("Substraction of given two num="+ r);
		break;
		case("*"):r=v1*v2;
		System.out.println("Multiplication of given two num="+ r);
		break;
		case("/"):r=v1/v2;
		System.out.println("Dividation of given two num="+ r);
		break;
		default:
		System.out.println("Please provied correct input");

		
		}
		
		
		
	}

}
