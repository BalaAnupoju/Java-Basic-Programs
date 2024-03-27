package coding;

public class Binary_Search {

	public static void main(String[] args) {
	int target=7;
	int arr[]= {1,2,3,4,5,6,7,8,};
	int res=binarySearch(arr,target);
	if(res==-1)
	{
		System.out.println("Element is not available");
	}
	else
	{
		System.out.println("element is available at --> " +res);
	}

	}

	private static int binarySearch(int[] arr, int target) {
		int min=0;
		int max=arr.length-1;
		while(min<=max)
		{
			int mid= min+(max-min)/2;
			int value=arr[mid];
			if(value<target)
			{
				min=mid+1;
			}
			else if(value>target)
			{
				min=mid-1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}

}
