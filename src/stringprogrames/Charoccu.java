package stringprogrames;

import java.util.Scanner;

public class Charoccu {
   /* 
    We have to create int array of as per asci value of character that is start from 1 to 256
	we can store the character occurence in integer by using this array
    we used for loop for traverse the string 
	every index value in array represent repetation of character as per asci value
	this line convert each character into integer form which is asci value
	by using this lop we found occurence of characters asci value
	but for represent the asci value in th form of character 
	now we take another for loop which transeverse the array value 
	getting occurenc of character more than zero we used if conditional statement 
  */
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String v=sc.nextLine();
		sc.close();
		
		int [] ch=new int[256];
		
		for(int i=0;i<v.length();i++)
		{
			ch[(int)v.charAt(i)]++;
			
		}
		
		for(char i=0;i<256;i++)// asci value which is sored in array
		{
			if(ch[i]!=0 && i!=' ')  //jyavleli char he shunypeksha jast asel te print honar
			{
				System.out.println(i+"  "+ch[i]);
			}
		}
		
	}

}
