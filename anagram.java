package preparation;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) 
	{

String s1="listen";
String s2="silent";
//int n1=s1.length();
//int n2=s2.length();
char[] c1=s1.toCharArray();
char[] c2=s2.toCharArray();
Arrays.sort(c1);
System.out.println(c1);
Arrays.sort(c2);
System.out.println(c2);

boolean res1=(s1.length()== s2.length());
boolean res2= Arrays.equals(c1,c2);
System.out.println(res1);
System.out.println(res2);
if(res1 && res2)
{
	System.out.println("anagram");
}
else
{
	System.out.println("not anagram");
}
	}

}
