package tasks;

import java.util.Scanner;

public class rev_t_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int rev=0;
		Scanner sc= new Scanner(System.in);
		int a =sc.nextInt();
		
		while(a!=0)
		{
		   temp=a%10;
		   rev=rev*10+temp;
		   a=a/10;
		}
		System.out.println(rev);
			
		

	}

}
