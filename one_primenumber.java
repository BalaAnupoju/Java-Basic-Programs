package preparation;

public class one_primenumber {

	public static void main(String[] args) {
		int num=100;
		int count=0;
		for(int i=2;i<=num;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
		
		if(count==0)
		{
			System.out.println(i +" ");
		}

	}
	}
}
