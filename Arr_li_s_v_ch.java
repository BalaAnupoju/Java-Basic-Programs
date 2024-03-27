package tasks;

import java.util.ArrayList;
import java.util.Collections;

public class Arr_li_s_v_ch {

	public static void main(String[] args) throws Exception{
		ArrayList al=new ArrayList();
		al.add('b');
		al.add('V');
		al.add('a');
		al.add('e');
		al.add('L');
		al.add('n');
		al.add('K');
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add(2);
		al1.add(89);
		al1.add(5);
		al1.add(45);
		al1.add(13);
		al1.add(25);
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println(al1);
		
		al.addAll(al1);
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
		
		
	}

}
