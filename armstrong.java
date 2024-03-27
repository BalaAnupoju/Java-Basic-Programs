package preparation;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=371;
int backup,remainder,sum=0;
int i = (int)(Math.log10(number))+1;
int res=0;
backup=number;
while(backup!=0)
{
	remainder=backup%10;
	res=(int) Math.pow(remainder,i);
	backup/=10;
	System.out.println(res);
	sum+=(int)res;
}
if(sum==number) 
{
	System.out.println( number + "--> armstrong ");
}
else
{
	System.out.println( number + "--> Not armstrong ");
}
		
		
	}

}
