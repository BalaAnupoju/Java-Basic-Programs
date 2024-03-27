package coding;

import java.util.Stack;

public class Reverse_with_Stack {

	public static void main(String[] args) {
	Stack<Character> stack=new Stack<>();
	String s="Bala";
	char[] str_char=s.toCharArray();
	for(char a:str_char)
	{
		stack.push(a);
	}
    for(int i=0;i<s.length();i++) {
    	str_char[i]=stack.pop();
    }
    System.out.println(new String(str_char));
	}

}
