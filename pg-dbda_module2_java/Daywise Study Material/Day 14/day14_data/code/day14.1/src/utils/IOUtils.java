package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import static utils.ShopUtils.*;

import com.shop.core.Product;

public interface IOUtils {
	//add a static method to store product details in the bin format to bin file
	static void writeData(Map<Integer, Product> map, String fileName) throws IOException {
//1. create chain of i/o strms
		//Java App ----> OOS (bin) ---> FOS ---> bin file
		try (ObjectOutputStream out = new ObjectOutputStream
				(new FileOutputStream(fileName))) {
			//write the data
			out.writeObject(map);//serialization
		}//out.close --> fos.close --> closes the file
	}
	//add a static method re store the products from the bin file
	@SuppressWarnings("unchecked")
	static Map<Integer, Product> restoreData(String fileName) throws IOException,ClassNotFoundException
	{
		//chain of strms for de-serial
		//Java App <----- OIS : conversion strm<----FIS : node strm <----bin file
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(fileName)))
		{
			return (Map<Integer, Product>) in.readObject();
		} catch (Exception e) {
			System.out.println("in catch "+e);
			// file does not exist or some other rum time err
			//return populated map to the caller
			System.out.println("returning populated map as the startup condition");
			return populateProductMap(populateProductList());
			
		}
		
	}
}
