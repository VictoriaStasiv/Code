
public class newTask4 {
	

		public static void main(String[] args) {
			int[] array = {30, 2, 10, 4, 6};
			int length = array.length;
	for (int gap = length/2; gap>0; gap/=2)
	{
	for(int i =gap; i<length; i++){
	int t= array[i];
	int j;
	for(j=i; j>=gap && array[j-gap]>t; j-=gap)
	{ 
	array[j]=array[j-gap];
	}
	array[j]=t;
	}
	}

	//PUT YOUR CODE HERE

	//PUT YOUR CODE HERE
	   
	for (int i = 0; i < length; i++) {
	System.out.print(array[i] + " ");
	}
	}
	      

	      
	
	
}
