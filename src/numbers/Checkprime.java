package numbers;

import java.util.Scanner;

public class Checkprime {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
	    int num=sc.nextInt();
	    sc.close();
	    int temp=0;
	    
	    for(int i=2;i<num-1;i++)
	    {
	    	if(num%i==0)
		    {
		    	temp=temp+1;
		    	
		    }
		    
	    	
	    	
	    }
	    if(temp==0)
	    {
	    	System.out.println("Given num is prime num");
	    }
	    	
	    	
	    	else
	    {
	    	System.out.println("not prime num");
	    }
	    

	}

}
