package coding;

public class prime_way2 {

	public static void main(String[] args) {
		int n=100,i;
		
		for(i=2;i<=n;i++)
		{
			int cnt=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)	
				{
					cnt++;
				}
			
			}
			if(cnt==0) 
			{
				System.out.print(i + " ");
			}
		}
		
				
	}
		
	}


