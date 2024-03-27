package coding;

import java.util.HashMap;
import java.util.Map;

public class Unique_val_using_Meth {

	public static void main(String[] args) {
		String s="ABCDabcdABCDabcDe";
		char[] ar=s.toCharArray();
    
		unique(ar);
		

	}

	private static void unique(char[] ar)
	{
		Map<Character,Integer> charMap=new HashMap();
		for(char c: ar)
		{
			if(charMap.containsKey(c)) {
				charMap.put(c,charMap.get(c)+1);
			
			}
			else
			{
			    charMap.put(c, 1);
			    
			}
		}
		System.out.println(charMap);
		
	

	}
	}
