package coding;

public class Bubble_Sort_char 
{

	public static void main(String[] args) 
	{
		char[] c= {'b','z','d','v','w','q','s','a','T','I'};
		for(int i=0;i<c.length-1;i++)
		{
			for(int j=0;j<c.length-1-i;j++) 
			{
				if(c[j]>c[j+1])
				{
					char temp= c[j];
					c[j]=c[j+1];
					c[j+1]= temp;
				}
				
			}
		}
		for(char a: c)
		{
			System.out.print(a+ " ");
		}

	}

}
