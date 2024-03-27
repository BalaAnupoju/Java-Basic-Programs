package tasks;

import java.util.ArrayList;
import java.util.Collections;

public class arr_li_v_thr extends Thread{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al =new ArrayList<Integer>();
	        al.add(10);
			al.add(2);
			al.add(89);
			al.add(5);
			al.add(45);
			al.add(13);
			al.add(25);
			Collections.synchronizedList(al);
			System.out.println(al);
			thread_meth();
			
	}
	
	private static void thread_meth() {

		arr_li_v_thr alt1 = new arr_li_v_thr();
		arr_li_v_thr alt2 = new arr_li_v_thr();
		arr_li_v_thr alt3= new arr_li_v_thr();
		alt1.start();
		alt2.start();
		alt3.start();
	}
	public void run() {
		//synchronized(al)
			//for(Integer i : al)
		System.out.println(Thread.currentThread().getName());
			
		}
	
	}

