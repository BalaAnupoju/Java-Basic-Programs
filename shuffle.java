package Assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class shuffle
{

	public static void main(String[] args) 
	{
	
	        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
	        
	        shuffleArray(originalArray);
	        
	        for (int i = 0; i < originalArray.length; i++) 
	        {
	            System.out.print(originalArray[i] + " ");
	        }
	    }
	   
	    public static void shuffleArray(int[] array) 
	    {
	      
	        Random random = new Random();
	        
	        for (int i = array.length - 1; i > 0; i--)
	        {
	            int j = random.nextInt(i + 1);
	            
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	        }
	    
	}
	
	}


