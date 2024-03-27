package preparation;

public class vowelconsocount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="BalaSaraswathiAnupoju";
		int v_count=0;
		int c_count=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				v_count++;
			}
			else
			{
				c_count++;
			}
			
		}
		System.out.println(c_count);
		System.out.println(v_count);
	}

}
