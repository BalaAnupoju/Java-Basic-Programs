package preparation;

public class reverse 
{

	public static void main(String[] args) {
		System.out.println("Reverse for characters");
		String a="bala";
		String b="";
		char[] c=a.toCharArray();
	for(int i=a.length()-1;i>=0;i--)
	{
		b+=c[i];
	}
	System.out.println(b);
	
	System.out.println("---------------------------------------------");
	
	System.out.println("Reverse for numbers");
	int num=154;
	int rev=0;
	while(num!=0)
	{
		int temp=num%10;
		rev=rev*10+temp;
		num=num/10;
	}
	
	System.out.println(rev);
	}
	
}