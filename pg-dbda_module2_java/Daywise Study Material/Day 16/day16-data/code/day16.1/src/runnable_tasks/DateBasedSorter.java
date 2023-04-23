package runnable_tasks;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Map;
import java.util.stream.Stream;

import com.shop.core.Product;

public class DateBasedSorter implements Runnable {
	// state
	private Map<Integer, Product> products;
	private String fileName;

	public DateBasedSorter(Map<Integer, Product> products, String fileName) {
		super();
		this.products = products;
		this.fileName = fileName;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
		 Stream<Product> sortedProductStream = products.values() //Collection<Product>
		 .stream() //Stream<Product>
		 .sorted((p1,p2) -> p1.getManufactureDate().compareTo(p2.getManufactureDate()));
		 //I/O stream 
		 //Java app --> pw --> fw --> file
		 try(PrintWriter pw=new PrintWriter(new FileWriter(fileName)))
		 {
			 sortedProductStream.forEach(p -> pw.println(p));//pw::println
		 }//pw.close() --data will be save d in text file
		 System.out.println("sorted product details as per date saved!");
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got exc " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}

}
