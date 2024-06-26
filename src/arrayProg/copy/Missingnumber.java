package arrayProg.copy;

public class Missingnumber {

	public static void main(String[] args) {
	  int [] c= {1,2,3,5,6};
	  
	  int ec=c.length+1;
	  int ects=ec*(ec+1)/2;
	  int actt=0;
	  
	  for(int i=0;i<c.length;i++)
	  {
		 actt=actt+c[i] ;
	  }
	  
	  System.out.println(ects-actt);
	  
	  
	  
	  
	}

}
