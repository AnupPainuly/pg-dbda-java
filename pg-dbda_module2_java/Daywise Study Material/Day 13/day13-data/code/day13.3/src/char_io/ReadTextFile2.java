package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ReadTextFile2 {

	public static void main(String[] args) {
		// reads data from text file , using buffer , till EOF n prints only lines , length > 40 the same
		System.out.println("Enter file name");
		try(Scanner sc=new Scanner(System.in);
				//Java App <-----BR <---- FR <----- text file
				BufferedReader br=new BufferedReader(new FileReader(sc.nextLine()))
				)
		{
			System.out.println("File contents : ");
//
			//Declarative style : FP
			br.lines() //Stream<String>
			.filter(line -> line.length()>80)
			.map(String :: toUpperCase)//line -> line.toUpperCase()
			.forEach(System.out::println);
			System.out.println();
		System.out.println("File reading over....");
				
		} //JVM invokes auto : br.close() ,sc.close()
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
