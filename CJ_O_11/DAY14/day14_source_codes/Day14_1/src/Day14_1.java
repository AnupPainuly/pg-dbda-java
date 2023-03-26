import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
// read and write a single byte in binary file
// FileInputStream
// FileOutputStream

public class Day14_1 
{
	static Scanner sc = new Scanner(System.in);
	static final String path_name="Demo.dat";
	
	private static void writeRecord() 
	{
		FileOutputStream fos =null;
		
		try 
		{
			fos=new FileOutputStream(new File(path_name));
			byte data=123;
			fos.write(data);
			System.out.println("Data is successfully written inside the file");
		
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fos.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
	}

	private static void readRecord() 
	{
		FileInputStream fis=null;
		
		try 
		{
			fis=new FileInputStream(new File(path_name));
			byte data = (byte) fis.read();
			System.out.println("Reading the data from file = "+data);
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fis.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
	}

	private static int menuList()
	{
		System.out.println("Enter Choice : 0.Exit 1.Write Record 2.Read Record");
		return sc.nextInt();
	}
	
	public static void main(String[] args)
	{
		int choice;
		while((choice=Day14_1.menuList())!=0)
		{
			switch(choice)
			{
			case 1:
				Day14_1.writeRecord();
			break;
			case 2:
				Day14_1.readRecord();
			break;
			}
		}
		

	}

	
}
