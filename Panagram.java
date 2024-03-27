package Assignment;

import java.util.HashSet;
import java.util.Set;

public class Panagram 
{
	
	public static boolean checkPanagram(String s ) {
		try {
		Set<Character> set= new HashSet<>();
		for(char ch:s.toCharArray())
		{
		if(ch >='a' && ch<='z')
		{
			set.add(ch);
		}
		if(ch>='A' && ch<='Z')
		{
			ch=Character.toLowerCase(ch);
			set.add(ch);
		}
	}
		System.out.println(set);
		int b=set.size();
		if(b==26)
		{
			return true;
		}
		return false;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static void main(String[] args)
	{
		String s="abcedg fihkjm lonqps rutwvyxzzzzzzzz";
		if(checkPanagram(s)) {
			System.out.println("panagram");
		}else {
			System.out.println(" Not panagram");
		}
		
		
	}
}
