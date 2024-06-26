package arrayProg.copy;

public class withoutusingsortingmaxnum {
	
	public static void main(String[] args) 
	{
		//int[] a= {6,8,2,4,9,3,1,5,16,7,15,20,25};  
        int[] numbers = {6,8,2,4,9,3,1,5,16,7,15,20,25};
        
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        
        for(int i=0;i<numbers.length;i++)
        {
        	if(numbers[i]>max)
        	{
        		secondMax=max;
        		max=numbers[i];
        	}
        	else if(numbers[i]>secondMax && numbers[i]!=0)
        	{
        		secondMax=numbers[i];
        	}
        }
        
        
        
        
        System.out.println(secondMax);
        
        
        
        
        
        
        
        
        for (int num : numbers) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        
        System.out.println("The second maximum element is: " + secondMax);
	
		
	}
}
