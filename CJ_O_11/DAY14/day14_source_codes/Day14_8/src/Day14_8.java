import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
// Read multiple lines to and from the text files
// BufferedWriter and BufferedReader


public class Day14_8 {

	static Scanner sc = new Scanner(System.in);
	static final String path_name="Test.txt";
	
	private static void writeRecord() throws FileNotFoundException, IOException 
	{
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path_name))))
		{
			bw.write("Akshita Chanchlani");
			bw.newLine();
			bw.write("Technical Trainer");
			bw.newLine();
			bw.write("Sunbeam");
			bw.newLine();
			bw.write("pune");
			
		}
	}

	private static void readRecord() throws FileNotFoundException, IOException 
	{
		
		try(BufferedReader br = new BufferedReader(new FileReader(new File(path_name))))
		{
			String line;
			while((line=br.readLine())!=null)
				System.out.println(line);
		}
		
	}

	private static int menuList()
	{
		System.out.println("Enter Choice : 0.Exit 1.Write Record 2.Read Record");
		return sc.nextInt();
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		int choice;
		while((choice=Day14_8.menuList())!=0)
		{
			switch(choice)
			{
			case 1:
				Day14_8.writeRecord();
			break;
			case 2:
				Day14_8.readRecord();
			break;
			}
		}
		

	}

	
}
