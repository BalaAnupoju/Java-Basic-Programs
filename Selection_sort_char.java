package coding;

public class Selection_sort_char {

	public static void main(String[] args) {
		char[] c_ar= {'b','z','d','v','w','q','s','a','T','I'};
		for(int i=0;i<c_ar.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<c_ar.length;j++)
			{
				if(c_ar[min]>c_ar[j])
				{
					min=j;
				}
			}
			char temp=c_ar[i];
			c_ar[i]=c_ar[min];
			c_ar[min]=temp;
		}
		for(char b1_ar: c_ar)
		{
			System.out.print(b1_ar+ " ");
		}
		
	}

}
