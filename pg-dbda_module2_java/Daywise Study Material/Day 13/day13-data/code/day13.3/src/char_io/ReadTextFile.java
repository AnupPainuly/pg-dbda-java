package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) {
		// reads data from text file , using buffer , till EOF n prints the same
		System.out.println("Enter file name");
		try(Scanner sc=new Scanner(System.in);
				//Java App <-----BR <---- FR <----- text file
				BufferedReader br=new BufferedReader(new FileReader(sc.nextLine()))
				)
		{
			System.out.println("File contents : ");
			//Imperative style
//			String line=null;
//			while((line=br.readLine())!= null)
//				System.out.println(line);
			//Declarative style : FP
			br.lines() //Stream<String>
			.forEach(System.out::println);
		System.out.println("File reading over....");
				
		} //JVM invokes auto : br.close() ,sc.close()
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
