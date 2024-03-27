package coding;

import java.util.Arrays;

public class Binary_Search_char {

	public static void main(String[] args) {
		char target='v';
		char arr[]= {'b','z','d','v','w','q','s','a','T','I'};
	    Arrays.sort(arr);
	    System.out.println(arr);
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

		private static int binarySearch(char[] arr, char target) {
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
