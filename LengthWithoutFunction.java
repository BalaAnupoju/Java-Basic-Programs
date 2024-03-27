package tasks;

public class LengthWithoutFunction {

	public static void main(String[] args) {
		String str="Balasaraswathi";
		char[] ch=str.toCharArray();
		int c=0;
		for(int chrarr:ch)
		{
			c++;
		}
        System.out.println(c);

//--------------------------------type2---------------------------------------
	   int index=0,c1 = 0;
	   while(true)
	   { try {
		   char chr=str.charAt(index);
		   c1++;
		   index++;
	   }
	   
	   catch(Exception e)
	   {
		   break;
	   }
	
	   }
	   System.out.println(c1);
	
	}
    
}