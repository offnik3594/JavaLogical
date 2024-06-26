package arrayProg;

public class secodnmaxvalue {

	public static void main(String[] args) {
      int [] ch={1,2,3,15,4,5,6,7,8,9,10,16};
		
		int t;
		
		for(int i=0;i<ch.length;i++)
		{
		    for(int j=0;j<ch.length;j++)
		    {
		        if(ch[i]>ch[j])//just change the sighn for minimum value
		        {
		            
		            t=ch[i];
		            ch[i]=ch[j];
		            ch[j]=t;
		            
		        }
		    }
		}
		System.out.println(ch[1]);
		
	}

}
