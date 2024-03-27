package coding;

public class Linear_Search_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,2,4,8,5,3,9,6,1};
		int n=5;
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

	private static int linearSearch(int[] arr, int n) {
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
