package utils;

import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.shop.core.Product;

public interface IOUtils {
	//add a static  method  to store filtered products in the text file
	static void storeProducts(List<Product> products,String file) throws IOException
	{
		//create chain of out strms
		//Java App ---> PW ---> FW --> File
		try(PrintWriter pw=new PrintWriter(new FileWriter(file)))
		{
			products.forEach(pw::println);//p -> pw.println()
		}//pw.close() --> data from buffer written to the file --> file closed
	}
	
}
