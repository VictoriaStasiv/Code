
public class newTask5 {


		public static void main (String[] args) {

			        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
			        int numberToFind = 10; 
			        int leftIndex=0;
			        int rightIndex=data.length-1;
			        int result =-1;
			    
			      while(leftIndex <= rightIndex) {
			    	  int middleIndex=( leftIndex+ rightIndex)/2; 
			    	 
			        	if(numberToFind == data[middleIndex]  ) {
			        		result = middleIndex;
			        		break;
			        	}
			        		else if (data[middleIndex] > numberToFind )  {
		
			        	 	rightIndex =  middleIndex	-1;
			        			
			        			}else {
			        				leftIndex = middleIndex+1;
			        			}
			        			
			        			
			        			
			        		
			       
			        }//while
			        	
			        	
			       
		
			     System.out.println(result);
		} // main
			
	} // class

	      

