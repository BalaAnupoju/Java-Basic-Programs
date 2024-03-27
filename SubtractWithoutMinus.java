package tasks;

public class SubtractWithoutMinus {

	public static void main(String[] args) {
		
		//----------------type1-------------------//
		int a=100;
		int b=50;
		System.out.println(Math.subtractExact(a, b));
		
		//----------------type2-------------------//

		int e=124;
		int f=95;
		int count=0;
		for(int i=f;i<e;i++)
		{
			count++;
		}
		System.out.println(count);
		
		
		//---------------type3--------------------//
		int c=-200;
		int d=300;
		System.out.println(c+d);
		
		//--------------type4--------------------//
		
		int g=~43;
		int h=89;
		 System.out.println(g+h+1);
		 
		 //--------------type5------------------//
		 
		 // Applicable only for positive values
		 
		 int i=10;
		 int j=20;
		 int count1=0;
		 while(j>i)
		 {
				 i++;
				count1++;	
		 }
		 while(j<i)
		{
				 j++;
				count1++;	
		}
		 
		 System.out.println(count1);
		 }
	
				 
}
