package coding;

import java.util.HashMap;
import java.util.Map;

public class Unique_alphabet {

	public static void main(String[] args) {
	String s="ABCDabcdABCDabcDe";
	char[] chr_ar=s.toCharArray();
	Map<Character,Integer> charMap=new HashMap();
	for(char c: chr_ar) {
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




