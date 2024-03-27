package Assignment;

import java.util.HashMap;

public class ConversionOfRtoI {

	public static void main(String[] args) 
	{
	        String rom = "VI"; 
	        int integer= romanvalToIntval(rom);
	        System.out.println(integer);
	    }
		public static int romanvalToIntval(String str)
		{
	        if (str == null || str.length() == 0)
	        {
	            return 0;
	        }

	        HashMap<Character, Integer> romanMap = new HashMap<>();
	        romanMap.put('I', 1);
	        romanMap.put('V', 5);
	        romanMap.put('X', 10);
	        romanMap.put('L', 50);
	        romanMap.put('C', 100);
	        romanMap.put('D', 500);
	        romanMap.put('M', 1000);

	        int result = romanMap.get(str.charAt(str.length() - 1));

	        for (int i = str.length() - 2; i >= 0; i--) 
	        {
	            if (romanMap.get(str.charAt(i)) < romanMap.get(str.charAt(i + 1)))
	            {
	                result -= romanMap.get(str.charAt(i));
	            } 
	            else
	            {
	                result += romanMap.get(str.charAt(i));
	            }
	        }

	        return result;
	
	}

}
