package preparation;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		System.out.println("String palindrome");
		String s="BalaB";
		System.out.println(s);
		String pal="";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			pal+=c[i];
		}
		System.out.println(pal);
		
		if(s.equals(pal)) 
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		System.out.println("integer palindrome");
		 int a=121;
		 System.out.println(a);
		 int rev=0;
		 int temp=a;
		 while(a>0)
		 {
			 temp=a%10;
			 rev=rev*10+temp;
			 a=a/10;
		 }
		 System.out.println(rev);
		 if(temp==rev)
		 {
			 System.out.println("Palindrome");
		 }
//		 else
//		 {
//			 System.out.println("Not palindrome");
//		 }
		 

	}

}
