package coding;

public class Linear_Search_Char {

	public static void main(String[] args) {
		char arr[]= {'b','z','d','v','w','q','s','a','T','I'};
		char n='q';
		int res=linearSearch(arr,n);
		if(res==-1)
		{
			System.out.println("element not available");
		}
		else
		{
			System.out.println("element available at index" + res);
		}

	}

	private static int linearSearch(char[] arr, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				return i;
			}
		}
		return -1;

	}

}
