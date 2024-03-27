package tasks;
import java.util.Arrays;

public class Dup_T_2_1 {

	public static void main(String[] args) {
	
		        int i, j,k=0, temp = 0;
		        String str = " sitamahalakshmi";
		        char[] p = str.toCharArray();
		        int len1 = p.length;
		        char[] c1 = new char[len1];

		        Arrays.sort(p);

		        for (i = 0; i < len1; i++) {
		            for (j = i + 1; j < len1; j++) {
		                if (p[i] == p[j]) {
		                    temp++;
		                }
		            }
		            if (temp == 0) {
		                c1[k++] = p[i]; 
		            }
		            temp = 0; 
		        }
		
		        char[] result = new char[k];
		        for (i = 0; i < k; i++) {
		            result[i] = c1[i];
		            System.out.print(result[i]);
		        }
		    }

	}

