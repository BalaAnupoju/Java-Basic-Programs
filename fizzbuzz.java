package preparation;

import java.util.ArrayList;

public class fizzbuzz {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("fizzbuzz");
			}
			else if(i%3==0)
			{
				System.out.println("fizz");
			}
			else if(i%5==0)
			{
				System.out.println("buzz");
			}
			else
			{
				System.out.println(i);
			}
		}
		System.out.println("-----------------------------------------------------------");
		
		ArrayList al=new ArrayList<>();
		for(int i=0;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
			{
				al.add("fizzbuzz");
			}
			else if(i%3==0)
			{
				al.add("fizz");
			}
			else if(i%5==0)
			{
				al.add("buzz");
			}
			else
			{
				al.add(i);
			}
		}
		System.out.println(al);

	}

}
