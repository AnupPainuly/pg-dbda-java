import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
// read and write a single byte in binary file
// FileInputStream
// FileOutputStream
// try block handler 

public class Day14_2 
{
	static Scanner sc = new Scanner(System.in);
	static final String path_name="Demo.dat";
	
	private static void writeRecord() throws FileNotFoundException, IOException 
	{
		try(FileOutputStream fos = new FileOutputStream(new File(path_name));)
		{
			fos.write(123);
			System.out.println("Data is written successfully in the file");
		}
	}

	private static void readRecord() throws FileNotFoundException, IOException 
	{
		
		try(FileInputStream fis=new FileInputStream(new File(path_name));)
		{
			byte data = (byte)fis.read();
			System.out.println("Data read from the file = "+data);
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
		while((choice=Day14_2.menuList())!=0)
		{
			switch(choice)
			{
			case 1:
				Day14_2.writeRecord();
			break;
			case 2:
				Day14_2.readRecord();
			break;
			}
		}
		

	}

	
}
