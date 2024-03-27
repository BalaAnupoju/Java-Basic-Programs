package coding;

public class insertion_sort_char {

	public static void main(String[] args) {
		char[] chr= {'b','z','d','v','w','q','s','a','T','I'};
		insertionSortchar(chr);
		for(char a:chr)
		{
			System.out.print(a+ " ");
		}

	}

	private static void insertionSortchar(char[] chr ) {
	for(int i=1;i<chr.length;i++)
	{
		char temp=chr[i];
		int j=i-1;
		while(j>=0 && chr[j]>temp) {
			chr[j+1]=chr[j];
			j--;
		}
		chr[j+1]=temp;
	}
		

	}

}
