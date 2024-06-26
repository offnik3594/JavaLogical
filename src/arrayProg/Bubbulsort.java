package arrayProg;

import java.util.Arrays;

public class Bubbulsort {

	public static void main(String[] args) {
		int [] c={10,3,0,3,0,25};
	       int l= c.length;
	       
	       for(int i=0;i<l;i++)
	       {
	           for(int j=0;j<l-i-1;j++)
	           {
	               if(c[j]==0 &&c[j+1]!=0)
	               {
	                   int t=c[j];
	                   c[j]=c[j+1];
	                   c[j+1]=t;
	               }
	           }
	       }
	       System.out.println(Arrays.toString(c));
	       
	       
	       
	       
	       
	       
	}

}
