package coding;

public class Palindrome_int {

	public static void main(String[] args) {
		int num= 12121;
		int temp=num;
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println("PALINDROME");
		}
		else		
		{
			System.out.println("NOT PALINDROME");
		}
	}

}

