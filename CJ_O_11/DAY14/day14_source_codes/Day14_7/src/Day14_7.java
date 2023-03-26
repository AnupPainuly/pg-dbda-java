import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day14_7 {

	static Scanner sc = new Scanner(System.in);
	static final String path_name="Test.txt";
	
	private static void writeRecord() throws FileNotFoundException, IOException 
	{
		try(FileWriter fw = new FileWriter(new File(path_name));)
		{
			fw.write('A');
			System.out.println("Data is written successfully in the file");
		}
	}

	private static void readRecord() throws FileNotFoundException, IOException 
	{
		
		try(FileReader fr=new FileReader(new File(path_name));)
		{
			char ch = (char)fr.read();
			System.out.println("Data read from the file = "+ch);
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
		while((choice=Day14_7.menuList())!=0)
		{
			switch(choice)
			{
			case 1:
				Day14_7.writeRecord();
			break;
			case 2:
				Day14_7.readRecord();
			break;
			}
		}
		

	}

	
}
