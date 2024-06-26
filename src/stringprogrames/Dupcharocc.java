package stringprogrames;

import java.util.Scanner;

public class Dupcharocc {
	//every character have its uique interger value
	//convert string into character array to retrive characters
	//creaet set object with  hashset 
	//for loop to retiev character
     

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String v=sc.nextLine();
		sc.close();
		
		int[] ch=new int [256];
		
		for(int i=0;i<v.length();i++)
		{
			ch[(int)v.charAt(i)]++;
		}
		for(char i=0;i<256;i++)
		{
			if(ch[i]>1)//je character ek peksha jast ahe tevdhech print hhoil 
			{
				System.out.println(i+"  "+ch[i]);
			}
		}
		
		
		
		
	}

}
