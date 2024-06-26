package arrayProg.copy;

//we have to sort all number present in array asscending order.
//then we have to choose second index number which have 
//for that we have to use logical part for that  we can go with for loop to getting all index value
//then we have have to comapre each andd every value
//then we can use swapping number script

public class secmaxnum {

	public static void main(String[] args) {
		int[] a= {6,8,2,4,9,3,1,5,16,7,15,20,25};
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;i<a.length;i++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		
		System.out.println(a[a.length-1]);
		
	
	}

}
