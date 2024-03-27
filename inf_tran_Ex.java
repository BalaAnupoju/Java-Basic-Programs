package tasks;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class inf_tran_Ex 
{
	public static void main(String[] args) throws Exception
	{
        BufferedReader br = new BufferedReader(new FileReader("C:\\newfile\\task4.txt"));
	    System.out.println("file Readed");
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\newfile\\task5.txt")));
		System.out.println("file writed");
		int i;
		while((i=br.read())!=-1) 
		{
		bw.write((char)i);
		}
		System.out.println("file copied to another file");
		bw.flush();
		br.close();
		bw.close();
	
}
	}
