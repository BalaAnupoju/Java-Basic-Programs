package coding;

public class Leap_Year {
	 static boolean leap= false;
	public static void main(String[] args) {
		
		Leap_Yr_Check(2002);
		
	}

	private static void Leap_Yr_Check(int n) {
		if(n%4==0)
		{
			leap=true;
			if(n%100==0 || n%400==0 )
			{
				leap=true;	
			}
			else
			{
				leap=false;
			}
					
		}
		else
			leap=false;
		if(leap)
		{
			System.out.println("leapyr");
		}
		else
		{
			System.out.println(" not a leapyr");
		}
		
	}
}
