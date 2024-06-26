package numbers;

import java.util.Scanner;

public class PlidromNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter ypur num");
		int num=sc.nextInt();
		sc.close();
	    int temp=num;
	    int rev=0;
	    
	    while(temp!=0)
	    {
	      rev=rev*10+temp%10;
	      temp=temp/10;
	    }
	    System.out.println(rev);
	   if(rev==num)
	   {
		   System.out.println("given num is pallidrome");
	   }
	   else
	   {
		   System.out.println("given num is not pallidrome");
	   }
	
	
	
	
	
	
	
	
	
	
	
	
	}}